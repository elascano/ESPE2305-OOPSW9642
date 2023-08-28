/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.connection.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author yeshualinux
 */
public class MongoDbConnection {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public void connect() {
        MongoClientURI uri = new MongoClientURI("your_connection_string");
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("your_database_name");
        System.out.println("Connected to MongoDB");
    }

    public void disconnect() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Disconnected from MongoDB");
        }
    }
}
