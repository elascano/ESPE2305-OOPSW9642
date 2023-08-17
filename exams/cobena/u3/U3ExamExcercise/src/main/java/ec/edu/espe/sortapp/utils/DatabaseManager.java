
package ec.edu.espe.sortapp.utils;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */

public class DatabaseManager {
    
   public static MongoDatabase connectToDatabase(String uri, String dataBase){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase mongoDatabase = mongoClient.getDatabase(dataBase);
        
        System.out.println("-> Connected successfully to server " + dataBase);  
        return mongoDatabase;
    }
    
    public static MongoCollection connectToCollection(MongoDatabase database, String collection){
        MongoCollection<Document> mongoCollection = database.getCollection(collection);
       
        if (mongoCollection == null ){
            database.createCollection(collection);
            mongoCollection = database.getCollection(collection);
        }
        
        return mongoCollection; 
    }
    
    public static  boolean insertDocument(MongoCollection collection, HashMap<Object, Object> map){
        Object documentId  = map.get("id");
        if(!existsDocument(collection,"id", Integer.valueOf(documentId.toString()))){
            Document document = createDocument(map);
            try {
                collection.insertOne(document);
                System.out.println("-> Inserted successfully");
                return true;
            } catch (Exception e) {
                System.out.println("-> Insertion failed");
                return false;
            }
        }else{
            System.out.println("-> Insertion failed");
            return false;
        }
    }
    
    private static Document createDocument(HashMap<Object, Object> map) {
        Document document = new Document();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            document.append(entry.getKey().toString(), entry.getValue());
        }
        return document;
    }
    
    private static Document createUpdateOneFieldDocument(String targetField, Object newValue) {
        Document document = new Document();
        Document updateDocument = new Document("$set", targetField+":"+newValue);
        return updateDocument;
    }
    
    private static Document createUpdateDocument(HashMap<Object, Object> map) {
        Document document = new Document();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            document.append(entry.getKey().toString(), entry.getValue());
        }
        Document updateDocument = new Document("$set", document);
        return updateDocument;
    }
    
    
    public static ArrayList<Object> getFieldValues(MongoCollection<Document> collection, String field) {
        ArrayList<Object> readedValues = new ArrayList<>();
        if (existsField(collection, field)) {
            try (MongoCursor<Document> cursor = collection.find().iterator()) {
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    readedValues.add(document.get(field));
                }
            }
        }
        return readedValues;
    }
    
    public static boolean updateDocument(MongoCollection<Document> collection, HashMap<Object, Object> updatedMap){
        Object documentId  = updatedMap.get("id");
        Bson filter = search(collection, Integer.parseInt(documentId.toString()));
        if (filter!=null) {
            Bson updatedDocument = createUpdateDocument(updatedMap);
            collection.updateOne(filter, updatedDocument);
            System.out.println("-> Updated succesfully");
            return true;
        }
        else {
            System.out.println("-> Updated failed");
            return false;
        }
    }
    
    public static boolean updateOneFieldDocument(HashMap<Object, Object> map,MongoCollection<Document> collection,  String targetField, Object newValue){
        Object documentId  = map.get("id");
        Bson filter = search(collection, Integer.parseInt(documentId.toString()));
        if (filter!=null) {
            Bson updatedDocument = createUpdateOneFieldDocument(targetField, newValue);
            collection.updateOne(filter, updatedDocument);
            System.out.println("-> Updated succesfully");
            return true;
        }
        else {
            System.out.println("-> Updated failed");
            return false;
        }
    }
    
    public static boolean deleteDocument(MongoCollection<Document> collection, HashMap<Object, Object> targetMap) {
        Object documentId  = targetMap.get("id");
        Document foundedDocument = search(collection, Integer.parseInt(documentId.toString()));
        if (foundedDocument!=null) {
            Bson query = foundedDocument;
            collection.deleteOne(query);
            System.out.println("-> Deleted successfully");
            return true; 
        }
        else {
            System.out.println("-> Deleted failed");
            return false;
        }
    }
    
    public static Object getDocumentValue(MongoCollection<Document> collection, String searchField, Object searchValue, String targetField) {
        if (existsDocument(collection, searchField, searchValue)) {
            Document query = new Document(searchField, searchValue);
            Document document = collection.find(query).first();
            Object value = document.get(targetField);
            return value;
        } else {
            return null;
        }
    }
    
    public static boolean existsDocument(MongoCollection collection, String field,  Object value){
        Document query = new Document(field, value);
        FindIterable<Document> documents = collection.find(query);
        return documents.first() != null;
    }
    
    public static boolean existsField(MongoCollection<Document> collection, String field) {
        Document sampleDoc = collection.find().first();
        return sampleDoc != null && sampleDoc.containsKey(field);
    }
    
    public static HashMap<Object,Object> obtain(MongoCollection<Document> collection, int id) {
        Document obtainedDocument = search(collection, id);
        HashMap<Object,Object> obtained = new HashMap<>();
        
        if(obtainedDocument!=null){
            obtained = convertDocumentStringIntoKeyValues(obtainedDocument.toString());             
        }
        return obtained;
    }
    
    public static HashMap<Object,Object> obtain(MongoCollection<Document> collection, String key, Object value) {
        Document obtainedDocument = search(collection, key, value);
        HashMap<Object,Object> obtained = new HashMap<>();
        
        if(obtainedDocument!=null){
            obtained = convertDocumentStringIntoKeyValues(obtainedDocument.toString());             
        }
        return obtained;
    }
    
    public static ArrayList<HashMap<Object,Object>> obtainAll(MongoCollection<Document> collection) {
        MongoCursor<Document> cursor = collection.find().iterator();
        ArrayList<HashMap<Object,Object>> allObtained = new ArrayList<>();
        HashMap<Object,Object> obtained = new HashMap<>();
        
        while(cursor.hasNext()){
            Document obtainedDocument = cursor.next();
            if(obtainedDocument!=null){
                obtained = convertDocumentStringIntoKeyValues(obtainedDocument.toString());             
                allObtained.add(obtained);
            }
        }
        
        return allObtained;
    }
    
    public static HashMap<Object,Object> convertDocumentStringIntoKeyValues(String documentString){
        HashMap<Object, Object> converted = new HashMap<>();
        String[] keyValues = documentString.split(", ");
        
        for(int i = 1; i<keyValues.length; i++){
            String keyValue = "";
            
            keyValue = keyValues[i]; 
            
            if(keyValue.contains("[")){
                do{
                    keyValue = keyValue + keyValues[i];
                    i++;    
                }while(!keyValue.contains("]"));
            }
            
            int separator = keyValue.indexOf("=");

            String key = keyValue.substring(0, separator);
            String value;
            if(i<keyValues.length-1){
                value = keyValue.substring(separator+1, keyValue.length());
            }
            else{
                value = keyValue.substring(separator+1, keyValue.length()-2);
            }
            converted.put(key, value);

        }
        return converted;
    }
    
    public static Document search(MongoCollection<Document> collection, int id){
        Document query = new Document("id", id);
        FindIterable<Document> documents = collection.find(query);
        Document foundedDocument = documents.first();
        return foundedDocument;
    }

    public static Document search(MongoCollection<Document> collection, String key, Object value){
        Document query = new Document(key, value);
        FindIterable<Document> documents = collection.find(query);
        Document foundedDocument = documents.first();
        
        return foundedDocument;
    }
    
}

