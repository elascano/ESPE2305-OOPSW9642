
package ec.edu.espe.strategy.controller;

import com.mongodb.client.MongoCollection;
import static ec.edu.espe.strategy.controller.MongoConnection.getConnection;
import org.bson.Document;

/**
 *
 * @author Leonel Tipan, Code Warriors, DCCO-ESPE
 */
public class SortController {
    public static void addSortCase(Document sortCase) {
        MongoCollection activitiesCollection = getConnection("arrayLeonel");
        activitiesCollection.insertOne(sortCase);
    }
}
