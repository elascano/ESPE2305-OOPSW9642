package ec.edu.espe.ellipsearea.view;

import java.util.Scanner;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Interface {
    
    public int option;
    
    public void request(){
        
        while(true){
        
            System.out.println("Welcome to Ellipse Area Calculator");
            System.out.println("1. Calculate");
            System.out.println("2. Examine Data");
            System.out.println("3. Exit");

            try{

                Scanner scannerData = new Scanner(System.in);
                int scannerOption = scannerData.nextInt();
                if((scannerOption < 1) || (scannerOption > 3)){
                    System.out.println("Error: Option not available. Try again.");
                    request();
                    break;
                }
                this.option = scannerOption;
                break;
            }catch(Exception e){
                System.out.println("Error: You can only enter numbers. Try again. ");
                request();
                break;
            }
            
        } 
    }
}
