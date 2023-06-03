package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.JsonFile;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Menu {
    
    JsonFile jsonFile = new JsonFile();
    
    public void showMainMenu(){
        Scanner keyboardInput = new Scanner(System.in);
        int option;
        do{
            do{
                System.out.println(" -------- CHICKEN FARM -------- ");
                System.out.println("Select the number of the option you want to do");
                System.out.println("1.- Add chickens to a coop ");
                System.out.println("2.- Look for chickens in a coop ");
                System.out.println("3.- Exit ");
                option = keyboardInput.nextInt();
                if(option<1 || option >3){
                    System.out.println("The option entered doesn't exist in the"
                            + " menu options");
                }
            }while(option<1 || option >3);
            
            jsonFile.setFileName("JsonChickenTest");
            
            switch(option){
                case 1:
                    showDataEntryMenu();
                    break;
                case 2:
                    
                    break;
            }
        }while(option!=3);
        
    }
    
    public void showDataEntryMenu(){
        Scanner keyboardInput = new Scanner(System.in);
        Chicken chicken = new Chicken();
        Date date = new Date();
        String repeatMenu;
        int coopId;
        ArrayList<Coop> coops;
        
        coops = createCoops(2);
        
        do{
            System.out.println(" -------- CHICKEN ENTRY -------- ");
            System.out.println("Enter the id of the chicken you are entrying");
            chicken.setId(keyboardInput.nextInt());
            System.out.println("Enter the name of the chicken you are entrying");
            chicken.setName(keyboardInput.next());
            System.out.println("Enter the color of the chicken you are entrying");
            chicken.setColor(keyboardInput.next());
            System.out.println("Enter the born year of the chicken you are entrying");
            date.setYear(keyboardInput.nextInt());
            System.out.println("Enter the born month of the chicken you are entrying");
            date.setMonth(keyboardInput.nextInt());
            System.out.println("Enter the born day of the chicken you are entrying");
            date.setDate(keyboardInput.nextInt());
            chicken.setBornOnDate(date);
            
            System.out.println("Enter the coop where the chicken will be");
            coopId = keyboardInput.nextInt();
            
            coops.get(coopId-1).getChickens().add(chicken);
            
            jsonFile.write(coops, chicken, coopId);
            
            System.out.println("Do you want to enter another chicken in the same coop?");
            System.out.println("Write Y or y if you want, if you dont put "
                    + "another letter or word and press enter");
            repeatMenu = keyboardInput.next();
            
        }while("y".equals(repeatMenu) || "Y".equals(repeatMenu));    
    }
    
    public ArrayList<Coop> createCoops(int numberOfCoops){
        ArrayList <Coop> coops = new ArrayList();
        for(int i = 0; i<numberOfCoops; i++){
            ArrayList <Chicken> chickens = new ArrayList();
            Coop coop = new Coop(i+1, chickens);
            coops.add(i, coop);
        }
        return coops;
    }
    
}
