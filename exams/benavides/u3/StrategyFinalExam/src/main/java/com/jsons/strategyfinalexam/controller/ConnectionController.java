/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class ConnectionController {
    private final String connectionString = "mongodb+srv://RBenavides:RBenavides@cluster0.js2ve9m.mongodb.net/";
    private final ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
    private final MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
    private final MongoClient mongoClient = MongoClients.create(settings);
    private final MongoDatabase database = mongoClient.getDatabase("StrategyBenavides");
    
    public String getConnectionString() {
        return connectionString;
    }

    public ServerApi getServerApi() {
        return serverApi;
    }

    public MongoClientSettings getSettings() {
        return settings;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    
}
