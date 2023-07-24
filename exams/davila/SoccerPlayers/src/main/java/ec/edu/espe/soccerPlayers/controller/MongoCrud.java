package ec.edu.espe.soccerPlayers.controller;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import java.util.ArrayList;
import java.util.List;

public class MongoCrud {
    private MongoCollection<Document> collection;

    public MongoCrud(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    public List<Document> getAllSoccer() {
        List<Document> players = new ArrayList<>();
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            players.add(cursor.next());
        }
        return players;
    }

    public Document addSoccer(Document player) {
        collection.insertOne(player);
        return player;
    }


    public Document updateSoccer(int idToUpdate, Document animalDetails) {
        Document updatePlayer = collection.findOneAndReplace(new Document("id", idToUpdate), animalDetails);
        return updatePlayer;
    }
}
