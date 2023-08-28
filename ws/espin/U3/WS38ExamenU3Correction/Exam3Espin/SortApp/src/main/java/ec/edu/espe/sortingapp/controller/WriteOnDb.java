package ec.edu.espe.sortingapp.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.sortingapp.utils.DbConnectionManager;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class WriteOnDb {
    MongoClient client = DbConnectionManager.getInstance().getClient();
    MongoCollection collection = client.getDatabase("StrategyFlores").getCollection("arrayCaetano");
    
    public void writeToDb(String sortingMethod, String unsorted, String sortedNumbers) {
        Document document = new Document("unsorted", unsorted).append("sortingMethod", sortingMethod)
                .append("sorted", sortedNumbers);
        collection.insertOne(document);
    }
}
