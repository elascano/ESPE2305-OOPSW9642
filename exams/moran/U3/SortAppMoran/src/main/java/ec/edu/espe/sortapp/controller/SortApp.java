/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.sortapp.controller;

import com.mongodb.client.MongoCollection;
import static ec.edu.espe.sortapp.controller.MongoDB.getConnection;
import org.bson.Document;

/**
 *
 * @author Moran David 
 */
public class SortApp {
    public static void Sort(Document Sort) {
        MongoCollection activitiesCollection = getConnection("arrayJeffrey");
        activitiesCollection.insertOne(Sort);
}
}