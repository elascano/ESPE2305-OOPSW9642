/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smartwatches.model;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO Espe
 */
public class Menu {
        private static List list1 = new List(1, new ArrayList<>());

    public static void showMenu(){
            Scanner scanner = new Scanner(System.in);
    int option;
        do {
            System.out.println("Menu options: ");
            System.out.println("1. Add a Smart Watch that you want.");
            System.out.println("2. Show the smart watch features.");
            System.out.println("3. Generate the file.");
            System.out.println("4. Exit.");
            option = scanner.nextInt();
            switch (option) {
                case 1:                   
                        SmartWatchData.addSmartWatch(list1);
                    break;

                case 2:
                    System.out.println("Smart Watch data:");
                    System.out.println("List:");
                    System.out.println(list1.getProducts());
                    break;
                case 3:
                          Gson gson = new Gson();
                                try {
                                      FileWriter fileWriter = new FileWriter("SmartwWatchs.json");
                                      String jsonList1 = gson.toJson(list1);
                                      fileWriter.write(jsonList1);
                                      fileWriter.close();
                                      System.out.println("File 'SmartWatchs.json' created.");
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
