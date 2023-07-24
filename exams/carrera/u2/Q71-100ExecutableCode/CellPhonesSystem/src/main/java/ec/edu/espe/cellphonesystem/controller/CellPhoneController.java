/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cellphonesystem.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class CellPhoneController {
    MongoClient client;
    MongoDatabase database;
    MongoCollection<Document> collection;

    public CellPhoneController(MongoClient client) {
        this.client = client;
        this.database = client.getDatabase("PabloCellPhones");
        this.collection = database.getCollection("CellPhones");
    }
    public CellPhoneController() {
    }
    
    public void insertCellPhone(String cellPhone) {
        Document document = new Document().parse(cellPhone);
        collection.insertOne(document);
    }
    
    public float calculatePrice(int memory, String brand) {
        float price;
        switch(brand) {
            case "samsung":
                price = memory * 150;
            break;
            
            case "apple":
                price = memory * 250;
            break;
            
            case "Xiaomi":
                price = memory * 100;
            break;
            
            default: //For generic cellphones
                price = memory * 110;
            break;
        }
        return price;
    }
}
