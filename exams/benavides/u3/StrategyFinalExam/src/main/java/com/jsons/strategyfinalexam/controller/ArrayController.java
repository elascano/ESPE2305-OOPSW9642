/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.controller;

import com.google.gson.Gson;
import com.jsons.strategyfinalexam.model.Array;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class ArrayController extends ConnectionController{
    MongoCollection<Document> collection = super.getDatabase().getCollection("ArrayRuben");
    
    public void add(Array array){
            try {
                Gson json = new Gson();
                String arrayData = json.toJson(array);
                Document document = Document.parse(arrayData);
                collection.insertOne(document);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        
    }
}
