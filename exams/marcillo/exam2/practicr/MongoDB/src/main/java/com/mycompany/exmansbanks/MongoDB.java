package com.mycompany.exmansbanks;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mongodb.controller.Banks;
import ec.edu.espe.mongodb.controller.BanksVie;
import java.util.Scanner;

public class MongoDB {
    public static void main(String[] args) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://JhordyM:JhordyM@cluster0.fiselec.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("U2Banks");
            MongoCollection<Document> collection = database.getCollection("U2Banks");

            Banks model = new Banks(collection);
            BanksVie view = new BanksVie();

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                view.displayMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        view.displayAllBanks(model.getAllBanks());
                        break;
      
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }
}

