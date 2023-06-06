package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.ChickenManager;
import ec.edu.espe.chickenfarm.model.FileManager;
import java.util.Scanner;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */

public class ChickenFarm {
    public static void chickenMenu(){
        
        int option;
        
        Scanner scan = new Scanner(System.in);
        ChickenManager chickenManager = new ChickenManager();
        FileManager fileManager = new FileManager();
        
        do{
            System.out.println("<-------------MENU------------->");
            System.out.println("1.-Enter Chickens Data");
            System.out.println("2. Create Json");
            System.out.println("3.-Print Chickens Data");
            System.out.println("4.- Exit");

            option = scan.nextInt();
    
        
            switch(option){
                case 1:
                    System.out.println("Enter Chickens Data");
                    chickenManager.addChicken();
                    break;
                    
                case 2:
                    fileManager.saveFile(chickenManager.getChickens(), "Chickens");
                    break;
                
                case 3:
                    System.out.println("Printing Chickens Data");
                    fileManager.printFile("Chickens");
                    break;
                
                case 4:
                    System.out.println("Exit Succesfully!!!");
                    break;
                
                default:
                    System.out.println("Error: invalid option. Input again: ");
                    break;
            }
        }while(option!=4);
        
    }
}