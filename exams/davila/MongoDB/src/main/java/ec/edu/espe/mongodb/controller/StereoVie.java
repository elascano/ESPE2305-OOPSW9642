package ec.edu.espe.mongodb.controller;

import org.bson.Document;
import java.util.Scanner;

public class StereoVie {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Display all stereos");
        System.out.println("2. Add an stereo");
        System.out.println("3. Update an stereo");
        System.out.println("4. Delete an stereo");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayAllStereo(Iterable<Document> stereos) {
        System.out.println("All stereo:");
        for (Document stereo : stereos) {
            System.out.println(stereo.toJson());
        }
    }

    public Document getStereoDetails(Scanner scanner) {
        System.out.print("Enter stereo id: ");
        int id = scanner.nextInt();
        System.out.print("Enter stereo company: ");
        String company = scanner.next();
        System.out.print("Enter stereo name: ");
        String name = scanner.next();
        System.out.print("Enter price stereo: ");
        double price = scanner.nextDouble();
        return new Document("name", name)
                .append("price", price)
                .append("company", company)
                .append("id", id);
    }

    public void addStereo(Document stereo) {
        System.out.println("stereo added:");
        System.out.println(stereo.toJson());
    }

    public int getStereoIdToUpdate(Scanner scanner) {
        System.out.print("Enter the ID of the stereo to update: ");
        return scanner.nextInt();
    }

    public void updateStereo(Document stereo) {
        System.out.println("stereo updated:");
        System.out.println(stereo.toJson());
    }

    public String getStereoIdToDelete(Scanner scanner) {
        System.out.print("Enter the ID of the stereo to delete: ");
        int id = scanner.nextInt();
        return Integer.toString(id);
    }


    public void deleteStereo(Document stereoId) {
        System.out.println("stereo deleted:");
        System.out.println("ID: " + stereoId);
    }
}
