package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    private static Coop coop1 = new Coop(1, new ArrayList<>());
    private static Coop coop2 = new Coop(2, new ArrayList<>());

    public static void showMenu() {
       Scanner scanner = new Scanner(System.in);
       int option;
        do {
            System.out.println("Menu options: ");
            System.out.println("1. Add a chicken in the coop that you want.");
            System.out.println("2. Show the chikens data?.");
            System.out.println("3. Generate the file.");
            System.out.println("4. Exit.");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please choose the coop.");
                    System.out.println("1. Coop 1.");
                    System.out.println("2. Coop 2.");
                    int coopOption = scanner.nextInt();
                    Coop chosenCoop = null;
                    
                      if (coopOption == 1) {
                        chosenCoop = coop1;
                    } else {
                        chosenCoop = coop2;
                    } 
                    DataChicken.addChickenToCoop(chosenCoop);  

                    break;

                case 2:
                    System.out.println("Chicken data:");
                    System.out.println("Coop 1:");
                    System.out.println(coop1.getChickens());
                    System.out.println("Coop 2:");
                    System.out.println(coop2.getChickens());
                    break;
                case 3:
                          Gson gson = new Gson();
                          String jsonCoop1 = gson.toJson(coop1);
                          String jsonCoop2 = gson.toJson(coop2);
    
                                try {
                                       FileWriter fileWriter = new FileWriter("datachickencoops.json");
                                                               fileWriter.write(jsonCoop1 + "\n" + jsonCoop2);
                                                               fileWriter.close();
                                                               System.out.println("File 'datachickencoops.json' created.");
                                } catch (IOException e) {
                                System.out.println("An error occurred while generating the file, I think that you have opened the archive :) " + e.getMessage());
                                }
    
                    break;

                case 4:
                    System.out.println("Thanks for using.");
                    break;
                default:
                    System.out.println("This option doesn't exist!, enter again: ");
                    break;
            }
        } while (option != 4);
      
    }    
     
}

