package ec.edu.espe.q61.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.q61.model.Keyboards;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Pamela Chipe,The javas,KillChainTeam
 */
public class KeyboardsController {
    public static void create(Keyboards vehicle){
        
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";

        MongoDatabase db = MongoDbConection.getConnection(uri, "Exam2");

        MongoCollection vehiclesCollection = db.getCollection("Vehicles");

        Document vehicleDoc = new Document("_id", new ObjectId()).
                  append("id",vehicle.getId()).
                  append("mark",vehicle.getMark()).
                  append("horsesPower",vehicle.getHorsesPower());
        vehiclesCollection.insertOne(vehicleDoc);
    }
    
}
