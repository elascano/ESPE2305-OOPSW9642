package ec.edu.espe.cellphonestore.view;

import java.util.Scanner;
import utils.Cellphone;
import utils.FileManager;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class CellPhoneStore {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
        int option;
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                option = scanner.nextInt();
                if(option < 1 || option > 4){
                    System.out.println("Invalid option, try again: ");
                }else{
                    break;
                }
            }catch(Exception e){
                System.out.println("Invalid Data, try again: ");
            }
        }
        Cellphone cellphone = new Cellphone();
        switch(option){
            case 1:
                cellphone.addCellphone();
                FileManager.save(cellphone);
            case 2:
                FileManager.read(cellphone);
            case 3:
                break;
        }
    }
}
