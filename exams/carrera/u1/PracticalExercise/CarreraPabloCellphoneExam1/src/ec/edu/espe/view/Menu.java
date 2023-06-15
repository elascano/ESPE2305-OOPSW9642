/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Store;
import java.util.Scanner;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Menu {
    public static void CellphoneMenu(){
        Store cellPhoneStore = new Store();
        Scanner scanner = new Scanner (System.in);
        int option;
        do{
            System.out.println("Menu Options.");
            System.out.println("1.Add cellphone");
            System.out.println("2.Delete cellphones");
            System.out.println("3.Exit");
            option = scanner.nextInt();
            
            switch(option) {
                case 1:
                   cellPhoneStore.addCelphone();
                break;
                case 2:
                    cellPhoneStore.deleteCellphone();
                break;
                case 3:
                    System.out.println("Leaving...");
                break;  
            }
        }while(option != 3);
       
        
    }
}
