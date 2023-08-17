package ec.edu.espe.mongodb.controller;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import java.util.ArrayList;
import java.util.List;

public class Stereos {
    private MongoCollection<Document> collection;

    public Stereos(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    public List<Document> getAllStereos() {
        List<Document> stereos = new ArrayList<>();
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            stereos.add(cursor.next());
        }
        return stereos;
    }

    public Document addStereos(Document stereo) {
        collection.insertOne(stereo);
        return stereo;
    }

    public Document deleteStereos(String id) {
        Document deleteStereo = collection.findOneAndDelete(new Document("id", id));
        return deleteStereo;
    }

    public Document deleteStereo(int id) {
        Document deleteStereo = collection.findOneAndDelete(Filters.eq("id", id));
        return deleteStereo;
    }

    public Document updateStereo(int idToUpdate, Document animalDetails) {
        Document updateStereo = collection.findOneAndReplace(new Document("id", idToUpdate), animalDetails);
        return updateStereo;
    }
}
