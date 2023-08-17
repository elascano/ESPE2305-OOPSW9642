package ec.edu.espe.SortApp.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class MongoConnection {
     public static MongoDatabase mongodb = null;

    public MongoConnection() {

    }

    public static MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://EdVerdesoto:<edverdesoto>@edverdesoto.nrtppkc.mongodb.net/?retryWrites=true&w=majority";
            String db = "arrayEdison";

            MongoClient mongoClient = MongoClients.create(uri);

            MongoConnection.mongodb = mongoClient.getDatabase(db);
        }

        return MongoConnection.mongodb;

    }
}
