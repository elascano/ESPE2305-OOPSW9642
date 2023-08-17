package com.mycompany.nurcesystem;

import com.mycompany.nurcesystem.Nurce;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Insert {
    
    public boolean insert(Nurce nurce){
        System.out.println("Insert ID:");
        Scanner sc = new Scanner
        return true;
    }
    
    public boolean connect(){
        
        String uri = "mongodb+srv://EdVerdesoto:edverdesoto@edverdesoto.nrtppkc.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Nurce");
            MongoCollection<Document> collection = database.getCollection("Nurce");
            Document doc = collection.find(eq()).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
        return false;
    }

}      

