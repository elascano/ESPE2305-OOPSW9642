package ec.edu.espe.chickenfarm.model;
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
public class ChickenFarmControl {
   
    
    
    public static ArrayList<Chicken> addChickens(Scanner sc){
        ArrayList<Chicken> chickensFromKeyboard  = new ArrayList<>(); 
        String confirmation; 
        int id; 
        String name; 
        String color; 
        int age; 
        boolean isMolting; 
        Chicken chickenWithKeyboardInfo; 
        do {
            System.out.println("Do you want to introduce a chicken? YES/NO ");
            confirmation = sc.next();
             try{
                if (confirmation.equalsIgnoreCase ("YES")){ 
                    System.out.print("Enter Chicken ID: "); 
                    id = sc.nextInt();
                    System.out.print("Enter Chicken name: ");
                    name = sc.next();
                    System.out.print("Enter Chicken color: ");
                    color = sc.next();
                    System.out.print("Enter Chicken age: ");
                    age = sc.nextInt();
                    System.out.print("Is the chicken molting? true/false: ");
                    isMolting = sc.nextBoolean();
                    chickenWithKeyboardInfo = new Chicken(id, name, color, age, isMolting); 
                    chickensFromKeyboard.add(chickenWithKeyboardInfo); 
                    }
            }catch(InputMismatchException error){
                 System.out.println("ENTER VALID INFORMATION");
                }
        }while (!confirmation.equalsIgnoreCase("NO")); 
         return chickensFromKeyboard;  
    }
     public static ArrayList<Chicken> readChickensFromFile(Scanner scFile){ 
        ArrayList<Chicken> chickensFromFile  = new ArrayList<>(); 
        Chicken chickenWithFileInfo; 
        Gson gson = new Gson();
                    while(scFile.hasNextLine()){
                chickenWithFileInfo = gson.fromJson(scFile.nextLine(), Chicken.class);
                chickensFromFile.add(chickenWithFileInfo); 
            }
        return chickensFromFile;
    }
    public static void writeChickensToFile(Scanner sc, File file){ 
      try{
          ArrayList<Chicken> addedChickens = addChickens(sc); 
              if (!addedChickens.isEmpty()){
                      Scanner scFile = new Scanner(file); 
                      ArrayList<Chicken> readedChickensFromFile  = readChickensFromFile(scFile); 

                      try(FileWriter fileWriter = new FileWriter("./dataBase.json");){
                          Gson gson = new Gson();
                          String json;

                          for (Chicken chicken: readedChickensFromFile){
                              json = gson.toJson(chicken);
                              fileWriter.write(json + "\n");
                          }
                          for (Chicken chicken: addedChickens){  
                              json = gson.toJson(chicken);
                              fileWriter.write(json + "\n");
                          }                      
                      System.out.println("Chickens ingresed to the System" );
                      for (Chicken chicken: addedChickens){
                          System.out.println(chicken);
                          }                      
                      }catch (Exception error){
                          System.out.println("COULD NOT WRITE THE FILE"); 
                      }
              }else{
                  System.out.println("New chicken added");
              }
          } catch (FileNotFoundException error){
              System.out.println("FILE NOT FOUND"); 
          }
    }
    
    public static void printChicken(Chicken chicken) {

        System.out.println("  Chicken " + chicken.getId() + " =");
        System.out.println("Chicken id -> " + chicken.getId());
        System.out.println("Chicken name -> " + chicken.getName());
        System.out.println("Chicken age -> "+ chicken.getAge()); 
        System.out.println("Chicken color -> " + chicken.getColor());
        System.out.println("Is the chicken molting? -> " + chicken.isIsMolting());
    }
    
    public static void printChickenTable( File file){
        try{
            Scanner scFile = new Scanner(file); 
            ArrayList<Chicken>chickenList  = readChickensFromFile(scFile); 
            System.out.printf("   %10s %20s %10s %10s %15s", "CHICKEN ID", 
                    "NAME", "COLOR", "AGE", "IS MOLTING");

            for (Chicken chicken: chickenList){
                System.out.format("   %10s %20s %10s %10s %15s", chicken.getId(), 
                        chicken.getName(),chicken.getColor(), 
                        chicken.getAge(), chicken.isIsMolting());
            }

        }catch(FileNotFoundException error){
            System.err.println("FILE NOT FOUND");
        }
    }
}
      
