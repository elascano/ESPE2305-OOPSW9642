package ec.edu.espe.exam.view;

import static ec.edu.espe.exam.model.GlassControl.printGlassTable;
import static ec.edu.espe.exam.model.GlassControl.writeGlassesToFile;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Screen {
    public static void cover() {
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("Subject: Oriented Objects Programming");
        System.out.println("NRC: 9642");
        System.out.println("INSTRUCTOR: Edison Lascano");
        System.out.println("Practical Exam. \n");
        }
    public static void optionMenu () {  
        cover();
       
        Scanner sc = new Scanner(System.in);
        File file = new File ("./dataBase.json");
        int chosenMenuOption;
        boolean end;

            do {
                end = false;
                chosenMenuOption = getMenuChosenOption(sc);
                switch(chosenMenuOption){

                    case 1 -> {
                        writeGlassesToFile(sc, file);
                        break;
                    } 
                    
                    case 2 -> {
                        printGlassTable(file);
                        break;
                    }
                    case 3 -> {
                        System.err.println("Thank You for use the interface!");
                        end = true;
                        break;
                    }
                    default -> { 
                        System.err.println("ENTER A VALID NUMBER");
                        end = true;    
                        break;
                    }
                } 
            }while(end == false);
    }

    public static int getMenuChosenOption(Scanner sc){
        int menuOptionFromKeyboard; 
            try{
                System.out.println(" MENU ");
                System.out.println("GLASSES INPUT");
                System.out.println("1. Add a glasses");
                System.out.println("2. Print the list");
                System.out.println("3. Exit");
                System.out.println("Choose an option");

                 menuOptionFromKeyboard = sc.nextInt();
            }catch(InputMismatchException error){
                return 4;
            }
       return menuOptionFromKeyboard; 
    }
     
}
