/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.Ws08Collections.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import espe.edu.ec.Ws08Collections.model.Chicken;
import espe.edu.ec.Ws08Collections.model.Coop;
import espe.edu.ec.Ws08Collections.model.Egg;
import espe.edu.ec.Ws08Collections.model.Poop;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//LocalTime, Calendar
/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        
                
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(120, 2, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "maruja", "w", true, new Date(121, 11, 1));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
      
        System.out.println("Chicken --> " + chicken);        
        System.out.println("chickens size --> " + chickens.size());
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("coop --> " + coop);
        
        coop2 = new Coop(2, chickens2);
        
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("coop2 --> " + coop2);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        Scanner collectData = new Scanner(System.in);  
       
        System.out.println("Seleccione la opción deseada: ");
        System.out.println("1. Añadir una gallina ");
        System.out.println("2. Editar una gallina");
        System.out.println("3. Borrar una gallina");
        System.out.println("4. Salir");
        
        int menu = collectData.nextInt();  
        
        switch (menu){
            case 1 -> {
                System.out.println("Ingrese el id de la gallina");        
                int id = collectData.nextInt();
                System.out.println("Ingrese el nombre de la gallina");
                String nameSet = collectData.next();
                System.out.println("Ingrese el Color de la gallina");        
                String color = collectData.next();
                System.out.println("Está mudando de plumaje la gallina?");        
                boolean molting = collectData.nextBoolean();
                System.out.println("Ingrese el día de nacimiento de la gallina");        
                int dia = collectData.nextInt();
                System.out.println("Ingrese el mes de nacimiento de la gallina");        
                int mes = collectData.nextInt();
                System.out.println("Ingrese el año de nacimiento de la gallina");        
                int año = collectData.nextInt();

                chicken = new Chicken(id, nameSet,color,molting, new Date(año,mes,dia));
                chickens.add(chicken);
            }
            case 2 -> {
                System.out.println("Ingrese el id de la gallina");        
                int id2 = collectData.nextInt();
                System.out.println("Ingrese el nombre de la gallina");
                String nameSet2 = collectData.next();
                System.out.println("Ingrese el Color de la gallina");        
                String color2 = collectData.next();
                System.out.println("Esta mudando de plumaje la gallina?");        
                boolean molting2 = collectData.nextBoolean();
                System.out.println("Ingrese el dia de nacimiento de la gallina");        
                int dia2 = collectData.nextInt();
                System.out.println("Ingrese el mes de nacimiento de la gallina");        
                int mes2 = collectData.nextInt();
                System.out.println("Ingrese el ano de nacimiento de la gallina");        
                int año2 = collectData.nextInt();
                
                chicken = new Chicken(id2, nameSet2,color2,molting2, new Date(año2,mes2,dia2));
                id2=id2-1;
                chickens.set(id2, chicken);
            }
            case 3 -> {
                System.out.println("Que elemento desea borrar?");
                int id3=collectData.nextInt();
                id3=id3-1;
                chickens.remove(id3);
            }
            case 4 -> System.out.println("Gracias por usar el sistema!");
                
        } 
       System.out.println("Chicken --> " + chickens);
     
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

       
        String filePath = "chickens.json";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            
            gson.toJson(chickens, fileWriter);
            System.out.println("Archivo Json creado.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo Json: " + e.getMessage());
        }
        
        
       
        
        }
    
    
        
               
    }


