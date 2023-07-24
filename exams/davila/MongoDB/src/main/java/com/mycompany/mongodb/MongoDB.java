package com.mycompany.mongodb;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mongodb.controller.Stereos;
import ec.edu.espe.mongodb.controller.StereoVie;
import java.util.Scanner;

public class MongoDB {
    public static void main(String[] args) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://JhordyM:JhordyM@cluster0.fiselec.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Stereo");
            MongoCollection<Document> collection = database.getCollection("Stereo");

            Stereos model = new Stereos(collection);
            StereoVie view = new StereoVie();

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                view.displayMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        view.displayAllStereo(model.getAllStereos());
                        break;
                    case 2:
                        view.addStereo(model.addStereos(view.getStereoDetails(scanner)));
                        break;
                    case 3:
                        view.displayAllStereo(model.getAllStereos());
                        int idToUpdate = view.getStereoIdToUpdate(scanner);
                        view.updateStereo(model.updateStereo(idToUpdate, view.getStereoDetails(scanner)));
                        break;

                    case 4:
                        view.displayAllStereo(model.getAllStereos());
                        int idToDelete = view.getStereoIdToUpdate(scanner);
                        Document deleteStereo = model.deleteStereo(idToDelete);
                        if (deleteStereo != null) {
                            view.deleteStereo(deleteStereo);
                        } else {
                            System.out.println("Stereo with ID " + idToDelete + " not found.");
                        }
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

