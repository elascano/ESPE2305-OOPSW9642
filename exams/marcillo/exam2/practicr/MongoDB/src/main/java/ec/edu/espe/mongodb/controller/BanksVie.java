package ec.edu.espe.mongodb.controller;

import org.bson.Document;
import java.util.Scanner;

public class BanksVie {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Display all banks");;
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayAllBanks(Iterable<Document> banks) {
        System.out.println("All stereo:");
        for (Document bank : banks) {
            System.out.println(bank.toJson());
        }
    }

    public Document getStereoDetails(Scanner scanner) {
        System.out.print("Enter banks id: ");
        int id = scanner.nextInt();
        System.out.print("Enter banks iva: ");
        String iva = scanner.next();
        System.out.print("Enter banks name: ");
        String name = scanner.next();
        System.out.print("Enter price banks: ");
        double price = scanner.nextDouble();
        return new Document("name", name)
                .append("price", price)
                .append("iva", iva)
                .append("id", id);
    }

}
