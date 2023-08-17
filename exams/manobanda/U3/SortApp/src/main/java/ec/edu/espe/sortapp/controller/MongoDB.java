
package ec.edu.espe.sortapp.controller;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author jnman
 */
public class MongoDB {
    public static MongoCollection<org.bson.Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://JeffreyM:JeffreyM@cluster0.k57sghk.mongodb.net/";
            String dataBase = "StrategyManobanda";
            MongoClient client = MongoClients.create(url);
            MongoDatabase database = client.getDatabase(dataBase);
            MongoCollection<org.bson.Document> arrayJeffrey = database.getCollection(collection);

            return arrayJeffrey;
        } catch (MongoClientException exception) {
            System.out.println("No connection " + exception.getMessage());
            throw exception;
        }
    }
}
