
package ec.espe.edu.jsons.exerciseexam2.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.espe.edu.jsons.exerciseexam2.model.Cellphone;
import org.bson.Document;

/**
 *
 * @author wfcad
 */
public class CellphoneController {
    public static void add(Cellphone cellphone){
        
        String connectionString = "mongodb+srv://ACalero:ACalero@cluster0.anenxt4.mongodb.net/";
        
                ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        
                MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("Cellphones");
                Gson json = new Gson();
                String patientData = json.toJson(cellphone);
                Document document = Document.parse(patientData);
                database.getCollection("Cellphone").insertOne(document);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
        
    }
}
