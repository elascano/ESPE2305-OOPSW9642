/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Strategy.controller;

import com.mongodb.client.MongoCollection;
import java.sql.SQLException;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class SortControllwe {
     public static void addSortCase(Document sortCase) throws SQLException {
        MongoCollection<Document> activitiesCollection = MongoConnection.getConnection("QuickSort");
        activitiesCollection.insertOne(sortCase);
    }

    public static void addSortCase2(Document sortCase) throws SQLException {
        MongoCollection<Document> activitiesCollection = MongoConnection.getConnection("BubbleSort");
        activitiesCollection.insertOne(sortCase);
    }

    public static void addSortCase3(Document sortCase) throws SQLException {
        MongoCollection<Document> activitiesCollection = MongoConnection.getConnection("InsertionSort");
        activitiesCollection.insertOne(sortCase);
    }
}
