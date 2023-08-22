
package ec.edu.espe.sortapp.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class ConnectionMongo {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://anthonymorales:anthonymorales@cluster0.nngqbpt.mongodb.net/";
        String db = "strategyMorales";
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            mongodb = mongoClient.getDatabase(db);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static MongoDatabase getConnection() {
        return mongodb;
    }

}
