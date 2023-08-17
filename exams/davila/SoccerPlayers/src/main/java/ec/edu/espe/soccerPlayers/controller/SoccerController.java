package ec.edu.espe.soccerPlayers.controller;

import org.bson.Document;
import java.util.Scanner;

public class SoccerController {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Display all Players");
        System.out.println("2. Update an Player");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayAllPlayer(Iterable<Document> players) {
        System.out.println("All Player:");
        for (Document player : players) {
            System.out.println(player.toJson());
        }
    }

    public Document getPlayerDetails(Scanner scanner) {
        System.out.print("Enter player id: ");
        int id = scanner.nextInt();
        System.out.print("Enter player name: ");
        String name = scanner.next();
        System.out.print("Enter player age: ");
        int age = scanner.nextInt();
        System.out.print("Enter number player: ");
        int number = scanner.nextInt();
        return new Document("name", name)
                .append("age", age)
                .append("number", number)
                .append("id", id);
    }


    public int getPlayerIdToUpdate(Scanner scanner) {
        System.out.print("Enter the ID of the player to update: ");
        return scanner.nextInt();
    }

    public void updatePlayer(int player, int playerIdToUpdate) {
        System.out.println("player updated:");
    }

}
