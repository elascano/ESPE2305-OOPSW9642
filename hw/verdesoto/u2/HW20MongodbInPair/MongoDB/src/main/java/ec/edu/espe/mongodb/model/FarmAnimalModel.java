package ec.edu.espe.mongodb.model;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class FarmAnimalModel {
    private MongoCollection<Document> collection;

    public FarmAnimalModel(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    public List<Document> getAllAnimals() {
        List<Document> animals = new ArrayList<>();
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            animals.add(cursor.next());
        }
        return animals;
    }

    public Document addAnimal(Document animal) {
        collection.insertOne(animal);
        return animal;
    }

    public Document deleteAnimal(String id) {
        Document deletedAnimal = collection.findOneAndDelete(new Document("id", id));
        return deletedAnimal;
    }

    public Document deleteAnimal(int id) {
        Document deletedAnimal = collection.findOneAndDelete(Filters.eq("id", id));
        return deletedAnimal;
    }

    public Document updateAnimal(int idToUpdate, Document animalDetails) {
        Document updatedAnimal = collection.findOneAndReplace(new Document("id", idToUpdate), animalDetails);
        return updatedAnimal;
    }
}
