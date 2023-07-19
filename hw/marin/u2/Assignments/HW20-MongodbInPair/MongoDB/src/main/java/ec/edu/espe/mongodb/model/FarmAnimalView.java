package ec.edu.espe.mongodb.model;

import org.bson.Document;
import java.util.Scanner;

public class FarmAnimalView {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Display all animals");
        System.out.println("2. Add an animal");
        System.out.println("3. Update an animal");
        System.out.println("4. Delete an animal");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayAllAnimals(Iterable<Document> animals) {
        System.out.println("All Animals:");
        for (Document animal : animals) {
            System.out.println(animal.toJson());
        }
    }

    public Document getAnimalDetails(Scanner scanner) {
        System.out.print("Enter animal id: ");
        int id = scanner.nextInt();
        System.out.print("Enter animal breed: ");
        String breed = scanner.next();
        System.out.print("Enter animal type: ");
        String type = scanner.next();
        System.out.print("Enter animal born on date: ");
        String bornOnDate = scanner.next();
        return new Document("id", id)
                .append("breed", breed)
                .append("animal", type)
                .append("bornOnDate", bornOnDate);
    }

    public void addAnimal(Document animal) {
        System.out.println("Animal added:");
        System.out.println(animal.toJson());
    }

    public int getAnimalIdToUpdate(Scanner scanner) {
        System.out.print("Enter the ID of the animal to update: ");
        return scanner.nextInt();
    }

    public void updateAnimal(Document animal) {
        System.out.println("Animal updated:");
        System.out.println(animal.toJson());
    }

    public String getAnimalIdToDelete(Scanner scanner) {
        System.out.print("Enter the ID of the animal to delete: ");
        int id = scanner.nextInt();
        return Integer.toString(id);
    }


    public void deleteAnimal(Document animalId) {
        System.out.println("Animal deleted:");
        System.out.println("ID: " + animalId);
    }
}
