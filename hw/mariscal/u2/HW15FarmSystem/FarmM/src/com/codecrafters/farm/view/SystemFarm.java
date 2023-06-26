/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.codecrafters.farm.view;

import com.codecrafters.farm.model.Chicken;
import com.codecrafters.farm.model.Cow;
import com.codecrafters.farm.model.FarmAnimal;
import com.codecrafters.farm.model.Goat;
import com.codecrafters.farm.model.Meat;
import com.codecrafters.farm.model.Pig;
import com.codecrafters.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class SystemFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
 
        meat = new Meat();
        farmAnimal = new Chicken(false,0 , 1, "broile",new Date());
        printFarmAnimal(farmAnimal);
        farmAnimal.produce();
        PrintFarmProduce(farmAnimal);  
        
        
        Chicken chicken = new Chicken(false, 0, 2, "Polish", new Date());
        chicken.produce(meat);
        chicken.layAnEgg();
        chicken.layAnEgg();
        printFarmAnimal(chicken);
        meat.setPounds(1);
        System.out.println("Chicken ate ---->" + chicken.produce(meat));
        
        
        Pig pig= new Pig("Charlotte ", 3, "Duroc", new Date());
        printFarmAnimal(pig);
        PrintFarmProduce(pig);
        lineBreak();
        pig.TrackTruffles();
        
        farmAnimal = new Sheep(4, "Merino", new Date());
        printFarmAnimal(farmAnimal);
        PrintFarmProduce(farmAnimal);
               
        Sheep sheep = new Sheep(5, "Karakul", new Date());
        printFarmAnimal(sheep);
        PrintFarmProduce(sheep);
        lineBreak();
        sheep.shear();
        sheep.lastSheering();
        lineBreak();

        Goat goat = new Goat(6, "Maljor", new Date());        
        printFarmAnimal(goat);
        PrintFarmProduce(goat);
        lineBreak();
        goat.shear();
        lineBreak();
        
        Cow cow = new Cow(true, 7, "Holstein", new Date());
        printFarmAnimal(cow);
        PrintFarmProduce(cow);
        lineBreak();
        cow.graze();
        lineBreak();
        
        
        
        
    }

    private static void lineBreak() {
        System.out.println("\n");
    }

    
    private static void PrintFarmProduce(FarmAnimal farmAnimal) {
        System.out.println(farmAnimal.getClass().getSimpleName()+ " ate ----->" +farmAnimal.produce());
    }

    private static void printFarmAnimal(FarmAnimal farmAnimal) {
        System.out.println("----------------------------------------------");
        System.out.println("type of FarmAnimal --->" + farmAnimal.getClass().getSimpleName());
        System.out.println(farmAnimal.getClass().getSimpleName()+ "------>" + farmAnimal );

    }
    

}
