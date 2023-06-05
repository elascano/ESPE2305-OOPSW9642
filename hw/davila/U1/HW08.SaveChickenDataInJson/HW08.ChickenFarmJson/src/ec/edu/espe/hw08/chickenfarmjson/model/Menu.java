
package ec.edu.espe.hw08.chickenfarmjson.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Menu {
    JsonFile jsonFile = new JsonFile();
    String dataReaded;
    int numberOfCoops=2;
    
    Scanner keyboardInput = new Scanner(System.in);
    public void showMainMenu(){
        
        int option;
        do{
            do{
                jsonFile.setFileName("archivo");
                
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
            
            switch(option){
                case 1:
                    showDataEntryMenu();
                    break;
                case 2:
                    showDataViewMenu();
                    
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
        coops = createCoops(numberOfCoops);
        
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
            chicken.setAge();
            
            do{
                System.out.println("Enter the coop where the chicken will be");
                coopId = keyboardInput.nextInt();
                
                if(coopId<1 || coopId>numberOfCoops){
                    System.out.println("The coops begins in the number 1 and "
                            + "and there are "+ numberOfCoops+" coops"
                                    + " Please again:");
                }
                
            }while(coopId<1 || coopId>numberOfCoops);
            
            
            coops.get(coopId-1).getChickens().add(chicken);
            
            if(jsonFile.exists()){
                dataReaded = jsonFile.readData();
                jsonFile.writeIfFileExists(chicken, coopId, dataReaded);
            }
            else{
                jsonFile.writeIfFileDoesntExists(coops);
            }
            
            
            System.out.println("Do you want to enter another chicken");
            System.out.println("Write Y or y if you want, if you dont put "
                    + "another letter or word and press enter");
            repeatMenu = keyboardInput.next();
        }while("y".equals(repeatMenu) || "Y".equals(repeatMenu));    
    }
    
    public void showDataViewMenu(){
        Scanner keyboardInput = new Scanner(System.in);
        int coopId;
        System.out.println(" -------- CHICKEN VIEW -------- ");
        do{
            System.out.println("Enter the id of the coop u want to see");
            coopId = keyboardInput.nextInt();
            
            if(coopId<1 || coopId>numberOfCoops){
                System.out.println("The coops begins in the number 1 and "
                        + "and there are "+ numberOfCoops+" coops"
                                + " Please again:");
            }

        }while(coopId<1 || coopId>numberOfCoops);
        
        dataReaded = jsonFile.readData();
        jsonFile.showFilteredCoop(dataReaded, coopId);
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
