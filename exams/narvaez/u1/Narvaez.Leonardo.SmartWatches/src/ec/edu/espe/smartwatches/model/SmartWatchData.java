/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smartwatches.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO Espe
 */
public class SmartWatchData {
       
    public static void addSmartWatch(List list){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the ID:");
        int id = scanner.nextInt();
        System.out.println("Enter the mark that you want: ");
        String name = scanner.next();
        System.out.println("Enter the Color: ");
        String color = scanner.next();
        Product smartWatch = new Product(id, color, name);
         list.getProducts().add(smartWatch);
        System.out.println("Chicken added to the coop.");
    }
    
}
