
package ec.edu.espe.jasons.controller;

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
import ec.edu.espe.jasons.model.Computer;
import java.util.ArrayList;

/**
 *
 * @author wfcad
 */
public class ComputerController {
    
    public static void add(Computer computer) {
        // Implementar la lógica para agregar un mueble a la base de datos
        String connectionString = "mongodb+srv://ACalero:ACalero@cluster0.anenxt4.mongodb.net/";
        
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi).build();
        
        try (MongoClient mongoClient = MongoClients.create(settings)){
            try {
                MongoDatabase database = mongoClient.getDatabase("Computers");
                Gson json = new Gson();
                String computerData = json.toJson(computer);
                Document document = Document.parse(computerData);
                database.getCollection("Computer").insertOne(document);
            }catch (MongoException e){
                e.printStackTrace();
            }
        }
    }
    public static ArrayList<Computer> show() {
        String connectionString = "mongodb+srv://ACalero:ACalero@cluster0.anenxt4.mongodb.net/";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        ArrayList<Computer> computers = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("Computers");
                MongoCollection<Document> collection = database.getCollection("Computer");
                MongoCursor<Document> cursor = collection.find().iterator();
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    Computer computer = new Computer();

                    computer.setId(document.getInteger("id"));
                    computer.setBrand(document.getString("brand"));
                    computer.setAmount(document.getInteger("amount"));
                    computer.setPrice(document.getInteger("price"));

                    computers.add(computer);
                }
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }

        return computers;
    }
}
