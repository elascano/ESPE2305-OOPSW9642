package ec.edu.espe.actorsystem.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static ec.edu.espe.actorsystem.controller.Utils.existsField;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class ActorController {
    
        public static ArrayList<Object> getFieldValues(MongoCollection<Document> collection, String field) {
        ArrayList<Object> readedValues = new ArrayList<>();
        if (existsField(collection, field)) {
            try (MongoCursor<Document> cursor = collection.find().iterator()) {
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    readedValues.add(document.get(field));
                }
            }
        }
        return readedValues;
    }
        public static long CalculateSalary (long salary){
            
            return salary;
        }
        
}
