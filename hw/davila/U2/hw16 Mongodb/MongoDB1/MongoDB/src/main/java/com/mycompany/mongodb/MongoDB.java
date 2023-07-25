package com.mycompany.mongodb;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mongodb.model.FarmAnimalModel;
import ec.edu.espe.mongodb.model.FarmAnimalView;
import java.util.Scanner;

public class MongoDB {
    public static void main(String[] args) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://JhordyM:JhordyM@cluster0.fiselec.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FarmAnimal");
            MongoCollection<Document> collection = database.getCollection("FarmAnimal");

            FarmAnimalModel model = new FarmAnimalModel(collection);
            FarmAnimalView view = new FarmAnimalView();

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                view.displayMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        view.displayAllAnimals(model.getAllAnimals());
                        break;
                    case 2:
                        view.addAnimal(model.addAnimal(view.getAnimalDetails(scanner)));
                        break;
                    case 3:
                        view.displayAllAnimals(model.getAllAnimals());
                        int idToUpdate = view.getAnimalIdToUpdate(scanner);
                        view.updateAnimal(model.updateAnimal(idToUpdate, view.getAnimalDetails(scanner)));
                        break;

                    case 4:
                        view.displayAllAnimals(model.getAllAnimals());
                        String idToDelete = view.getAnimalIdToDelete(scanner);
                        Document deletedAnimal = model.deleteAnimal(idToDelete);
                        if (deletedAnimal != null) {
                            view.deleteAnimal(deletedAnimal);
                        } else {
                            System.out.println("Animal with ID " + idToDelete + " not found.");
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

