/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.SortApp.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;



/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class DatabaseConnection {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public DatabaseConnection(String collectionName) {
        mongoClient = MongoClients.create("mongodb+srv://mesiasv25:12345@cluster0.txcolcw.mongodb.net/");
        database = mongoClient.getDatabase("strategyMariscal");
        collection = database.getCollection(collectionName);
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
    


}

