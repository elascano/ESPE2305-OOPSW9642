
package ec.espe.edu.MovieSystem.controller;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 * @param <ModelType>
 */

public class BasicController<ModelType> extends BasicModel {

    ModelType model;
    private MongoDatabase mongoDB = Connection.mongodb;

    private MongoCollection<Document> mongoCollection;

    public BasicController(ModelType object, String collectionName) {
        this.model = object;
        this.mongoCollection = mongoDB.getCollection(collectionName);
    }

    public ModelType parseDocumentToClass(Document document) {

        Gson gson = new Gson();
        return (ModelType) gson.fromJson(document.toJson(), model.getClass());

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    @Override
    public void create(Document document) {
        mongoCollection.insertOne(document);

    }
     @Override
    public Document read(String idFind,String valueFind) {
        
        return mongoCollection.find(eq(valueFind,idFind)).first();
    }
    @Override
    public Document read(Document document) {
         
        return mongoCollection.find(document).first();
    }



}

