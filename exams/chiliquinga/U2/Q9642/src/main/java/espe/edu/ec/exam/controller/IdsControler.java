/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.exam.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author yeshualinux
 */
public class IdsControler {
    private static final String CONNECTION_STRING = "mongodb+srv://yeshua:yeshua@cluster0.zwf1ijm.mongodb.net/";

    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;
    private Document selectedDocument;
    private String selectedJson;

    public IdsControler() {
        ConnectionString connectionString = new ConnectionString(CONNECTION_STRING);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("Exam");
        collection = database.getCollection("Fornitures");
        System.out.println("ingreso a la base de datos");
    }

    public boolean verifyrIdExist(String id) {
        BasicDBObject query = new BasicDBObject();
        query.put("id", Integer.parseInt(id));

        FindIterable<Document> documentos = collection.find(query);

        return documentos.iterator().hasNext();
    }
}
