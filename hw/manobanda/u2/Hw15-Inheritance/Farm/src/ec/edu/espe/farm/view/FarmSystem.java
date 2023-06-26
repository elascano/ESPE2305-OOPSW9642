/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import java.util.Date;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        
        printTypeAndAnimal(farmAnimal);
        System.out.println("Chicken -->" + farmAnimal);
        
        System.out.println("Chicken -->" + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("new chicken -->" + chicken);
        chicken.lanAnEgg();
        chicken.lanAnEgg();
        
        System.out.println("new chicken -->" + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate --->" + chicken.produce(meat));
       
        farmAnimal = new Pig(3, "Landrace", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("pig --->" + farmAnimal);
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("type of farmAnimal -->" + farmAnimal.getClass().getCanonicalName());
        
    }
}
