
package ec.edu.espe.view;

import ec.edu.espe.model.FileManager;
import ec.edu.espe.model.SoccerManager;
import java.util.ArrayList;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class SoccerInterface {
    ArrayList<SoccerManager> soccerTeams = new ArrayList<>();
    
    SoccerManager soccerManager= new PurchaseRegister(purchases);
    FileManager teamRegisterFile = new FileManager("TeamRegister");
    
    public void handleSoccerTeam() {
            while (true) {
                menuSoccerTeam();
                int purchaseOption = keyboardInput.nextInt();
                keyboardInput.nextLine();
                switch (purchaseOption) {
                    case 1 -> {
                        SoccerManager soccerManager = new SoccerManager(soccerManager);   
                        System.out.println("add team");

                    }
                    case 2 -> {
                        System.out.println("delete team");

                    }
      
                    default -> {
                        System.out.println("Opción invalida");
                    }
                }
            }
        }
    }
    
    public void menuSoccerTeam(){
        SoccerManager soccerManager
        System.out.println("*********************************************************");
        System.out.println("                    SOCCER TEAMS                         ");
        System.out.println("*********************************************************");
        System.out.println("");
        System.out.println("1.Add Information ");
        System.out.println("2.Delete Information ");
        System.out.println("");
        System.out.println("Escoja una opcion");
        System.out.println("");
        System.out.println("*********************************************************");
    }
    
    public SoccerManager createTeam(){
        SoccerManager soccerManager = new SoccerManager();
        System.out.println("Input ID team: ");
        soccerManager.setId(keyboardInput.nextInt());
        System.out.println("Input name of team: ");
        soccerManager.setName(keyboardInput.nextLine());
        System.out.println("Quality cups team win: ");
        soccerManager.setWinCup(keyboardInput.nextInt());
        keyboardInput.nextLine(); 
        
        return soccerManager;   
    }

}
