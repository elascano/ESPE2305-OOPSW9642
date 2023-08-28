/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.sortingProgram.controller;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Yeshua Chiliquinga, Jsons, DCCO-ESPE
 */
public class MongoConnection {
    public static MongoCollection<org.bson.Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://yeshua:yeshua@cluster0.zwf1ijm.mongodb.net/";
            String dataBase = "StrategyChiliquinga";
            MongoClient mc = MongoClients.create(url);
            MongoDatabase database = mc.getDatabase(dataBase);
            MongoCollection<org.bson.Document> c = database.getCollection(collection);

            return c;
        } catch (MongoClientException e) {
            System.out.println("Error connecting to MongoDB Atlas: " + e.getMessage());
            throw e;
        }
    }
}
