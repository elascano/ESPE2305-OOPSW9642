/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class MongoCRUD {
    
    private static final String uri = "mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority";
    private static final Scanner scan = new Scanner(System.in);
    private static final String collection = "Cow";
    private static final String databaseName = "exam";

    public static void addToMongo(Document product, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            try {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);

                productCollection.insertOne(product);

                System.out.println("New Product has been added: " + product.get("name"));

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void readMongo(int id, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            try {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);

                Bson filter = Filters.eq("id", id);

                try {
                    Document query = productCollection.find(Filters.and(filter)).first();

                    System.out.println("Product --> " + query.toJson());

                } catch (Exception e) {
                    System.out.println("Product not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
