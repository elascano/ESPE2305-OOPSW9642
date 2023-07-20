
package ec.edu.espe.Singer.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author  Code Warriors, DCCO-ESPE
 */
public class Connection {

    public static MongoDatabase mongodb = null;

    private Connection() {

    }

    public static MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://latipan06:latipan06@cluster0.kawghe4.mongodb.net/?retryWrites=true&w=majority";
            String db = "Singers";

            MongoClient mongoClient = MongoClients.create(uri);

            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
