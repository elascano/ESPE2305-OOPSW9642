/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam1.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.exam1.model.Vehicle;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruben Benavides, 'Jsons', DCCO-ESPE
 */
public class Exam {
    public static void main(String[] args) {
        
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        int id;
        String model;
        String color;
        
        for(int i = 0; i < 5; i++){
            
            Vehicle vehicle = new Vehicle();
            
            System.out.println("Introduce the id for the vehicle " + (i+1)+ ": " );
            while(true){
                try{
                    Scanner scanner = new Scanner(System.in);
                    id = scanner.nextInt();
                    break;
                }catch(Exception e){
                    System.out.println("Error. You just introduce wrong data. Try again: ");
                }
            }
            
            
            System.out.println("Introduce the model for the vehicle " + (i+1)+ ": " );
            while(true){
                try{
                    Scanner scanner = new Scanner(System.in);
                    model = scanner.nextLine();
                    break;
                }catch(Exception e){
                    System.out.println("Error. You just introduce wrong data. Try again: ");
                }
            }
            
            
            System.out.println("Introduce the color for the vehicle " + (i+1)+ ": " );
            while(true){
                try{
                    Scanner scanner = new Scanner(System.in);
                    color = scanner.nextLine();
                    break;
                }catch(Exception e){
                    System.out.println("Error. You just introduce wrong data. Try again: ");
                }
            }
            
            vehicle.setId(id);
            vehicle.setModel(model);
            vehicle.setColor(color);
            
            vehicles.add(vehicle);
            
        }
        
        for(int k = 0; k < vehicles.size(); k++){
            
            Gson json = new GsonBuilder().setPrettyPrinting().create();
            String data = json.toJson(vehicles.get(k));

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("vehicles.json", true))) {
                writer.newLine();
                writer.write(data);
                writer.newLine();
            } catch (IOException e) {
                System.out.println("Error in saving data: " + e.getMessage());
            }

            System.out.println(data);
        }
        
    }
}
