
package ec.edu.espe.sortapp.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.sortapp.model.Numbers;
import ec.edu.espe.sortapp.utils.ConnectionMongo;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public class NumbersController {

    private MongoDatabase mongoDatabase = ConnectionMongo.mongodb;

    private MongoCollection<Document> mongoCollection;

    public NumbersController() {
        this.mongoCollection = mongoDatabase.getCollection("arrayLeonardo");
    }

    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(Numbers listDigits) {
        Document document = new Document();
        document.append("NumbersDisordered", Arrays.toString(listDigits.getNumbersDisordered()));
        document.append("ListOfDigits", listDigits.getSizeOfListOfNumbers());
        document.append("Algorithm", listDigits.getSortAlgorithm());
        document.append("NumberOrdered", Arrays.toString(listDigits.getListOfNumberOrdered()));

        return document;
    }

}
