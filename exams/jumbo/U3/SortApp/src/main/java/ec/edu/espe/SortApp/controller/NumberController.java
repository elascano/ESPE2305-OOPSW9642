/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.SortApp.model.Numbers;
import ec.edu.espe.SortApp.utils.MongoDBConection;
import java.util.Arrays;
import javax.swing.text.Document;



/**
 *
 * @author Alexander Jumbo
 */
public class NumberController {
        private MongoDatabase mongoDatabase = ConnectionMongo.mongodb;

    private MongoCollection<Document> mongoCollection;

    public NumbersController() {
        this.mongoCollection = mongoDatabase.getCollection("numbers");
    }

    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(Numbers listDigits) {
        Document document = new Document();
        document.append("NumbersDisordered", Arrays.toString(listDigits.getNumbersDisordered()));
        document.append("ListOfDigits", listDigits.getSizeOfListOfNumbers());
        document.append("Algorithm", listDigits.getSortAlgorithm());
        document.append("NumberOrdered", Arrays.toString(listDigits.getListOfNumberOrdered()));

        return document;
    }
}
