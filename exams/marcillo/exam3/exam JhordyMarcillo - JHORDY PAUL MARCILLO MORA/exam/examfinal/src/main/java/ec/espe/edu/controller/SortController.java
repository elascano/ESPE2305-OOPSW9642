/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.controller;

import com.mongodb.client.MongoCollection;
import static ec.espe.edu.controller.MongoConnec.getConnection;
import org.bson.Document;

/**
 *
 * @author Jhordy Marcillo
 */
public class SortController {
    public static void addSortCase(Document sortCase) {
        MongoCollection activitiesCollection = getConnection("Jhordy");
        activitiesCollection.insertOne(sortCase);
    }
}
