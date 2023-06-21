package ec.edu.espe.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.model.Information;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jhordy Marcillo, CodeCrasfters, DCCO-ESPE
 */
public class Main {
  Information information=new Information();
  
   private static final String FILE_NAME = "Books.json";
   private static List<Information> infor = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        loadStudentsFromFile();

        System.out.println("-----------------------------");
        System.out.println("----------BOOKSTORE----------");
        System.out.println("-----------------------------");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Librarian");
            System.out.println("2. Costumer");
            System.out.println("3. Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    ownerMenu(scanner);
                    break;
                case 2:
                    costumerMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void ownerMenu(Scanner scanner) {
        System.out.println("\nLibrarian MENU:");
        System.out.println("1. Add books");
        System.out.println("2. Delete books");
        System.out.println("3. View books");
        System.out.println("4. Return to main menu");
        System.out.print("Enter an option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                addBooks(scanner);
                saveStudentsToFile(); 
                break;
            case 2:
                removeBooks(scanner);
                break;
            case 3:
                displayBooks();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void costumerMenu() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("\nCOSTUMER MENU:");
        System.out.println("1. View books");
        System.out.println("2. Return to main menu");
        System.out.print("Enter an option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                viewBooks();
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void addBooks(Scanner scanner) {
        System.out.println("\nADD BOOK");
        Information information=new Information();
        

        System.out.print("Enter ID of books: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        information.setId(id);

        System.out.print("Enter the name of books: ");
        String name = scanner.nextLine();
        information.setName(name);

        System.out.print("Enter the author of books: ");
        String author = scanner.nextLine();
        information.setAuthor(author);

        System.out.print("Enter editorial: ");
        String editorial = scanner.nextLine();
        information.setEditorial(editorial);
        
        System.out.print("Enter price: ");
        float price = scanner.nextInt();
        information.setPrice(price);
        
        infor.add(information);
        System.out.println("Book add successfully.");
    }

    private static void removeBooks(Scanner scanner) {
        System.out.println("\nRemove books");
        System.out.print("Enter ID books a remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;
        for (int i = 0; i < infor.size(); i++) {
            if (infor.get(i).getId() == id) {
                infor.remove(i);
                found = true;
                System.out.println("Books remove sucessfull.");
                break;
            }
        }

        if (!found) {
            System.out.println("no´t found books, pls repeat again.");
        }
    }

    private static void displayBooks() {
        System.out.println("\nArray of books");
        if (infor.isEmpty()) {
            System.out.println("no books registred.");
        } else {
            for (Information information : infor) {
                System.out.println(infor);
            }
        }
    }
    
    private static void viewBooks() {
    System.out.println("\nView books");
    if (infor.isEmpty()) {
        System.out.println("No books registered.");
    } else {
        for (Information information : infor) {
            System.out.println("ID: " + information.getId());
            System.out.println("Name: " + information.getName());
            System.out.println("Author: " + information.getAuthor());
            System.out.println("Editorial: " + information.getEditorial());
            System.out.println("Price: " + information.getPrice());
            System.out.println("-------------------------");
        }
    }
}

    private static void loadStudentsFromFile() {
        File file = new File(FILE_NAME);

        try (Scanner scanner = new Scanner(file)) {
            StringBuilder jsonString = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonString.append(scanner.nextLine());
            }

            Gson gson = new Gson();
            Information[] informationArray = gson.fromJson(jsonString.toString(), Information[].class);
            infor.clear();
            for (Information information : informationArray) {
                infor.add(information);
            }
        } catch (Exception e) {
            System.out.println("Error for load json for information of books: " + e.getMessage());
        }
    }

    private static void saveStudentsToFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(infor);

        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            pw.write(jsonString);
            pw.flush();
        } catch (Exception e) {
            System.out.println("Error for save books in json " + e.getMessage());
        }
    }
  
    
    
    
    
}
