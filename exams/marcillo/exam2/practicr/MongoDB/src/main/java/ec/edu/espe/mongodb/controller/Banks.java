package ec.edu.espe.mongodb.controller;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import java.util.ArrayList;
import java.util.List;

public class Banks {
    private MongoCollection<Document> collection;

    public Banks(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    public List<Document> getAllBanks() {
        List<Document> banks = new ArrayList<>();
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            banks.add(cursor.next());
        }
        return banks;
    }

}
