package ec.edu.espe.soccerPlayers.model;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.soccerPlayers.controller.MongoCrud;
import ec.edu.espe.soccerPlayers.controller.SoccerController;
import java.util.Scanner;

public class MongoDB {
    public static void main(String[] args) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://JhordyM:JhordyM@cluster0.fiselec.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SoccerPlayer");
            MongoCollection<Document> collection = database.getCollection("Players");

            MongoCrud model = new MongoCrud(collection);
            SoccerController view = new SoccerController();

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                view.displayMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        view.displayAllPlayer(model.getAllSoccer());
                        break;
                    case 2:
                        view.displayAllPlayer(model.getAllSoccer());
                        int idToUpdate = view.getPlayerIdToUpdate(scanner);
                        view.updatePlayer(idToUpdate, view.getPlayerIdToUpdate(scanner));
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

