package ec.edu.espe.exam1.view;

import ec.edu.espe.exam1.model.JsonFile;
import ec.edu.espe.exam1.model.Sport;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        ArrayList<Sport> sports;
        JsonFile jsonFile = new JsonFile("Sports");
        Sport sport = new Sport();
        
        int option;
        do{
            System.out.println("1. Data Input");
            System.out.println("2. Delete all");
            System.out.println("3. Exit");
            option = keyboardInput.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Input the sport id");
                    sport.setId(keyboardInput.nextInt());
                    System.out.println("Input the sport name");
                    sport.setName(keyboardInput.next());
                    
                    System.out.println("Input the sport tournament");
                    sport.setTournaments(keyboardInput.next());
                    
                    jsonFile.write(sport);
                    break;
                case 2:
                    jsonFile.deleteAllSaved();
            }
            
        }while(option!=3);
 
    }
}