
package espe.edu.ec.Mouse.show;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
class Calculator {

    private String name;
    private String price;
    private String connectionString;
    private String databaseName;
    private String collectionName;

    public Calculator(String name, String price, String connectionString, String databaseName, String collectionName) {
        this.name = name;
        this.price = price;
        this.connectionString = connectionString;
        this.databaseName = databaseName;
        this.collectionName = collectionName;
    }

    public void saveToMongoDB() {
        MongoClient mongoClient = new MongoClient(new MongoClientURI(this.connectionString));
        DB db = mongoClient.getDB(this.databaseName);
        DBCollection collection = db.getCollection(this.collectionName);

        BasicDBObject calculatorObject = new BasicDBObject();
        calculatorObject.put("name", this.name);
        calculatorObject.put("price", this.price);

        collection.insert(calculatorObject);
    }
}

