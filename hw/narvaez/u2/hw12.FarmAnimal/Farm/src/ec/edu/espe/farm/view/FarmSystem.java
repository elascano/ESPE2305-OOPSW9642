/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Alpaca;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;

import java.util.Date;

/**
 *
 * @author NarvaezLeonardo
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        
        farmAnimal = new Chicken(false,0,1,"broiled",new Date());        
        printTypeAndAnimal(farmAnimal);
        System.out.println("chicken -->"+farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false,0,2,"polish",new Date());
        chicken.produce(meat);
        System.out.println("new chicken -->"+chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        printTypeAndAnimal(farmAnimal);
        meat.setPounds(1);
        System.out.println("chicken ate -->"+chicken.produce(meat));
        
        farmAnimal = new Pig(0, 3, "Landrace", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("pig-->" +farmAnimal);
        
        farmAnimal =  new Cow(true, 0, 4, "Holstein", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("cow --> " + farmAnimal);
        
        farmAnimal =  new Sheep(new Date(), 0, 5, "Lincoln", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("sheep --> " + farmAnimal);
        
        farmAnimal =  new Turkey(true, 0, 6, "Real", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("turkey --> " + farmAnimal);
        
        farmAnimal = new Alpaca(new Date(), 0, 7, "Huacaya", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("alpaca -->"+ farmAnimal);
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("--------------------------");
        System.out.println("Type of farmAnimal--> "+farmAnimal.getClass().getSimpleName());
    }
}
