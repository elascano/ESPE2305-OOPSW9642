/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class FileManager {
  

     public void displayMenu() {
         
        int menuOption; 
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Computer manager");
            System.out.println("--------------------");
            System.out.println("1. Save computers");
            System.out.println("2. Read Computers");
            System.out.println("0. exit");
            System.out.print("Choose an option: ");
            
            menuOption = scanner.nextInt(); 
            switch (menuOption) {
            case 1:
                serializeObject();
                break;
            case 2:
                deserializeObject();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
            }
          
        }while(menuOption != 0);
    }
    private static void serializeObject() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data file name to save serialized object: ");
        String fileName = scanner.nextLine();
        
        // Create an object to serialize
        Computer computer = new Computer(1, "Papito", "Pavillion", 123456, 2015);
         
       
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(computer);
            objectOut.close();
            fileOut.close();
            System.out.println("Serialization complete. Serialized data is saved in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void deserializeObject() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data file name to deserialize object: ");
        String fileName = scanner.nextLine();

        // Deserialization
        Computer deserializedComputer = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            deserializedComputer = (Computer) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the deserialized object
        if (deserializedComputer != null) {
            System.out.println("Deserialized COmputer: " + deserializedComputer);
        }
    }
    
}
