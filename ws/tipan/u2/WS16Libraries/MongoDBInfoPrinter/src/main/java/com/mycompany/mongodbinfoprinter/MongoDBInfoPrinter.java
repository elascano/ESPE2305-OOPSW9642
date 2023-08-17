import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import java.util.Collections;

public class MongoDBInfoPrinter {
    public static void main(String[] args) {
        // Configurar la conexión a MongoDB
        String connectionString = "mongodb+srv://latipan06:latipan06@cluster0.kawghe4.mongodb.net/?retryWrites=true&w=majority";
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyToClusterSettings(builder -> builder.hosts(Collections.singletonList(new ServerAddress("cluster0.kawghe4.mongodb.net"))))
            .credential(MongoCredential.createCredential("latipan06", "admin", "latipan06".toCharArray()))
            .build();

        try (com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings)) {
            // Obtener la lista de bases de datos
            MongoIterable<String> databaseNames = mongoClient.listDatabaseNames();
            int totalDatabases = 0;
            int totalCollections = 0;
            for (String dbName : databaseNames) {
                totalDatabases++;
                System.out.println("Database: " + dbName);
                MongoDatabase database = mongoClient.getDatabase(dbName);

                // Obtener la lista de colecciones en cada base de datos
                MongoIterable<String> collectionNames = database.listCollectionNames();
                for (String collectionName : collectionNames) {
                    totalCollections++;
                    System.out.println("Collection: " + collectionName);
                }

                System.out.println();
            }

            // Imprimir información adicional
            System.out.println("Stats:");
            System.out.println(totalDatabases + " DBs");
            System.out.println(totalCollections + " Collections");
            System.out.println();
            System.out.println("Hosts:");
            for (ServerAddress host : mongoClient.getClusterDescription().getClusterSettings().getHosts()) {
                System.out.println(host);
            }
        }
    }
}
