/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.vehiclecrud.controller;

import com.jsons.vehiclecrud.model.Vehicle;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.google.gson.Gson;
import com.jsons.vehiclecrud.utils.PriceWithDiscount;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;


/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class VehicleController {
    public static void create(Vehicle vehicle){
        String connectionString = "mongodb+srv://RBenavides:RBenavides@cluster0.js2ve9m.mongodb.net/";
        
                ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("VehicleCRUD");
                Gson json = new Gson();
                String vehicleData = json.toJson(vehicle);
                Document document = Document.parse(vehicleData);
                database.getCollection("Vehicles").insertOne(document);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static ArrayList<Vehicle> show(){
        String connectionString = "mongodb+srv://RBenavides:RBenavides@cluster0.js2ve9m.mongodb.net/";

        ServerApi serverApi = ServerApi.builder()
        .version(ServerApiVersion.V1)
        .build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("VehicleCRUD");
                Gson json = new Gson();
                MongoCollection<Document> collection = database.getCollection("Vehicles");
                
                MongoCursor<Document> cursor = collection.find().iterator();
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    Vehicle vehicle = new Vehicle();
                    vehicle.setId(document.getInteger("id"));
                    vehicle.setName(document.getString("name"));
                    vehicle.setColor(document.getString("color"));
                    vehicle.setPrice(document.getDouble("price"));
                    vehicles.add(vehicle);
                }
            }catch (MongoException e) {
                e.printStackTrace();
            }
        }
        return vehicles;
    }
    
    public static void upload(int vehicleId, Vehicle newVehicle){
        String connectionString = "mongodb+srv://RBenavides:RBenavides@cluster0.js2ve9m.mongodb.net/";
        
                ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        
        if(newVehicle.getPrice() > 2000){
            double newPrice = PriceWithDiscount.computePrice(newVehicle.getPrice());
            newVehicle.setPrice(newPrice);
        }
        
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("VehicleCRUD");
                Document filter = new Document("id", vehicleId);

                Gson json = new Gson();
                String vehicleData = json.toJson(newVehicle);
                Document document = Document.parse(vehicleData);
                Document newDocument = new Document("$set", document);

                database.getCollection("Vehicles").updateOne(filter, newDocument);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        } 
    } 
    
    public static void delete(int vehicleId){
        String connectionString = "mongodb+srv://RBenavides:RBenavides@cluster0.js2ve9m.mongodb.net/";

        ServerApi serverApi = ServerApi.builder()
        .version(ServerApiVersion.V1)
        .build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("VehicleCRUD");
                Document filter = new Document("id", vehicleId);

                database.getCollection("Vehicles").deleteOne(filter);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        } 
    }
}
