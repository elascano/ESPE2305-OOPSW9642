/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ApartmentExam.View;

import ec.edu.espe.ApartmentExam1.model.Apartment;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.ApartmentExam1.model.Apartment;


/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class ApartmentArray {
    
   
    
    

    
    
    
    
public void Action(){        
    Apartment apartment;
    ArrayList<Apartment> apartments = new ArrayList<>();
    
    Scanner collectData = new Scanner(System.in); 
       
        
    
    int menu;
    
    
    do{
        
        
        System.out.println("Select the option you want to do: ");
        System.out.println("1. Add an apartment ");
        System.out.println("2. Print the Json File");        
        System.out.println("2. Count the number of apartments");
         
        menu = collectData.nextInt();
            switch (menu){
            case 1 -> {
                System.out.println("Ingrese el id del apartamento");        
                int id = collectData.nextInt();
                System.out.println("Type the name of the owner");
                String ownerName = collectData.next();
                System.out.println("Type the apartment number");        
                int apartmentNumber = collectData.nextInt();
                apartment = new Apartment (id, ownerName, apartmentNumber);
                apartments.add(apartment);
            }
            case 2 -> {
               
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

       
        String filePath = "apartments.json";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            
            gson.toJson(apartments, fileWriter);
            System.out.println("Archivo Json creado.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo Json: " + e.getMessage());
        }
            }
            
            case 3 -> {
                
                System.out.println("apartments size --> " + apartments.size());
                
                
            }
            } 
        }while(menu != 0);
            
    }
}

