package ec.edu.espe.sortingProgram.controller;

import com.mongodb.client.MongoCollection;
import static ec.edu.espe.sortingProgram.controller.MongoConnection.getConnection;
import org.bson.Document;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class SortController {
    public static void addSortCase(Document sortCase) {
        MongoCollection activitiesCollection = getConnection("arrayJosue");
        activitiesCollection.insertOne(sortCase);
    }
}
