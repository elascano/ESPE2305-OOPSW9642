package ec.edu.espe.exam.model;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class GlassControl {
    public static ArrayList<Glass> addGlasses(Scanner sc){
        ArrayList<Glass> glassFromKeyboard  = new ArrayList<>(); 
        String confirmation; 
        int id; 
        String name; 
        String color; 
        Glass glassWithKeyboardInfo;
        do {
            System.out.println("Do you want to introduce a glass? YES/NO ");
            confirmation = sc.next();
             try{
                if (confirmation.equalsIgnoreCase ("YES")){ 
                    System.out.print("Enter glass ID: "); 
                    id = sc.nextInt();
                    System.out.print("Enter glass name: ");
                    name = sc.next();
                    System.out.print("Enter glass color: ");
                    color = sc.next();

                    glassWithKeyboardInfo = new Glass(id, name, color); 
                    glassFromKeyboard.add(glassWithKeyboardInfo); 
                    }
            }catch(InputMismatchException error){
                 System.out.println("ENTER VALID INFORMATION");
                }
        }while (!confirmation.equalsIgnoreCase("NO")); 
         return glassFromKeyboard;  
    }
     public static ArrayList<Glass> readGlassFromFile(Scanner scFile){ 
        ArrayList<Glass> glassFromFile  = new ArrayList<>(); 
        Glass glassWithFileInfo; 
        Gson gson = new Gson();
                    while(scFile.hasNextLine()){
                glassWithFileInfo = gson.fromJson(scFile.nextLine(), Glass.class);
                glassFromFile.add(glassWithFileInfo); 
            }
        return glassFromFile;
    }
    public static void writeGlassesToFile(Scanner sc, File file){ 
      try{
          ArrayList<Glass> addedGlasses = addGlasses(sc); 
              if (!addedGlasses.isEmpty()){
                      Scanner scFile = new Scanner(file); 
                      ArrayList<Glass> readedGlassesFromFile  = readGlassFromFile(scFile); 

                      try(FileWriter fileWriter = new FileWriter("./dataBase.json");){
                          Gson gson = new Gson();
                          String json;

                          for (Glass glass: readedGlassesFromFile){
                              json = gson.toJson(glass);
                              fileWriter.write(json + "\n");
                          }
                          for (Glass glass: addedGlasses){  
                              json = gson.toJson(glass);
                              fileWriter.write(json + "\n");
                          }                      
                      System.out.println("Glasses ingresed to the System" );
                      for (Glass glass: addedGlasses){
                          System.out.println(glass);
                          }                      
                      }catch (Exception error){
                          System.out.println("COULD NOT WRITE THE FILE"); 
                      }
              }else{
                  System.out.println("New Glasses added");
              }
          } catch (FileNotFoundException error){
              System.out.println("FILE NOT FOUND"); 
          }
    }
    
    public static void printGlass(Glass glass) {

        System.out.println("  Glasses " + glass.getId() + " =");
        System.out.println("Glasses id -> " + glass.getId());
        System.out.println("Glasses name -> " + glass.getName());
 
    }
    
    public static void printGlassTable( File file){
        try{
            Scanner scFile = new Scanner(file); 
            ArrayList<Glass>glassList  = readGlassFromFile(scFile); 
            System.out.printf("   %10s %20s %10s ", "GLASSES ID", 
                    "NAME", "COLOR");
            for (Glass glass : glassList){
                System.out.format("   %10s %20s %10s", glass.getId(), 
                        glass.getName(),glass.getColor());
                
            }           
        }catch(FileNotFoundException error){
            System.err.println("FILE NOT FOUND");
        }
    }
}
