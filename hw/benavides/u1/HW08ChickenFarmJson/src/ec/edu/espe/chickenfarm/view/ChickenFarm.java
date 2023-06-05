/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Menu menu = new Menu();
        System.out.println("--Welcome to Ruben's chicken farm--");
        int option = 0;
        ArrayList<Chicken> firstCoopChickens = new ArrayList<>();
        ArrayList<Chicken> secondCoopChickens = new ArrayList<>();
        Coop firstCoop = new Coop(1, firstCoopChickens);
        Coop secondCoop = new Coop(2, secondCoopChickens);
        ArrayList<Coop> coops = new ArrayList<Coop>();
        Gson chickenFarmJson = new Gson();
        while(true){
            System.out.println("1. Add chicken");
            System.out.println("2. Upload info to JSON");
            System.out.println("3. Exit");
            System.out.println("What do you want to do(enter a number)? ");
            while(true){
                try{
                    Scanner optionScanner = new Scanner(System.in);
                    option = optionScanner.nextInt();
                    if(option < 1 || option > 3){
                        System.out.println("That option is not available. Try again: ");    
                    }else{
                        break;
                    }
                }catch(Exception e){
                    System.out.println("Error: " + e + "\n" + "Try again: ");
                }
            }
            switch(option){
                case 1:
                    System.out.println("Which Coop do you want to add the chickens in? ");
                    System.out.println("1");
                    System.out.println("2");
                    int coopOption = 0;
                    while(true){
                        try{
                            Scanner coopOptionScanner = new Scanner(System.in);
                            coopOption = coopOptionScanner.nextInt();
                            if(coopOption < 1 || coopOption > 2){
                                System.out.println("That option is not available. Try again: ");    
                            }else{
                                break;
                            }
                        }catch(Exception e){
                            System.out.println("Error: " + e + "\n" + "Try again: ");
                        }
                    }
                    if(coopOption == 1){
                        menu.addChicken(firstCoop);
                    }
                    if(coopOption == 2){
                        menu.addChicken(secondCoop);
                        break;
                    }
                case 2:
                    coops.add(firstCoop);
                    coops.add(secondCoop);
                    menu.uploadInformationToJsonFile(chickenFarmJson, coops);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
            }
            if(option == 3){
                break;
            }
        }
    }
}
