package espe.edu.ec.exam.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.google.gson.Gson;
import espe.edu.ec.exam.model.Forniture;
import java.util.ArrayList;


public class FornitureController {

    public static void add(Forniture forniture) {
        // Implementar la lógica para agregar un mueble a la base de datos
        String connectionString = "mongodb+srv://yeshua:yeshua@cluster0.zwf1ijm.mongodb.net/";
        
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi).build();
        
        try (MongoClient mongoClient = MongoClients.create(settings)){
            try {
                MongoDatabase database = mongoClient.getDatabase("Exam");
                Gson json = new Gson();
                String fornitureData = json.toJson(forniture);
                Document document = Document.parse(fornitureData);
                database.getCollection("Forniture").insertOne(document);
            }catch (MongoException e){
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Forniture> show() {
        String connectionString = "mongodb+srv://yeshua:yeshua@cluster0.zwf1ijm.mongodb.net/";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        ArrayList<Forniture> fornitures = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("Exam");
                MongoCollection<Document> collection = database.getCollection("Forniture");
                MongoCursor<Document> cursor = collection.find().iterator();
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    Forniture forniture = new Forniture();

                    forniture.setId(document.getInteger("id"));
                    forniture.setElement(document.getString("element"));
                    forniture.setCount(document.getInteger("count"));
                    forniture.setPrice(document.getInteger("price"));

                    fornitures.add(forniture);
                }
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }

        return fornitures;
        
    }
    
    public static void update(int fornitureId, Forniture newForniture) {

        String connectionString = "mongodb+srv://yeshua:yeshua@cluster0.zwf1ijm.mongodb.net/";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("Exam");
                Document filter = new Document("id", fornitureId);

                Gson json = new Gson();
                String fornitureData = json.toJson(newForniture);
                Document document = Document.parse(fornitureData);
                Document newDocument = new Document("$set", document);

                database.getCollection("Forniture").updateOne(filter, newDocument);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
}
