/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

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
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        
        FarmAnimal farmAnimal;
        farmAnimal = new Chicken(true, 0, 1,"broiled", new Date());
        farmAnimal.produce();
        printTypeAndAnimal(farmAnimal);
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.layAnEgg();
        chicken.layAnEgg();
        printTypeAndAnimal(chicken);
        
        Meat meat;
        meat = new Meat();
        meat.setPounds(2);
        System.out.println("chicken ate " + chicken.produce(meat));
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        printTypeAndAnimal(farmAnimal);
        
        Pig pig = new Pig(4,"Yorkshire", new Date());
        pig.produceSausage();
        printTypeAndAnimal(pig);
        
        farmAnimal = new Cow(5, "Angus", new Date(), true);
        printTypeAndAnimal(farmAnimal);
        
        Cow cow = new Cow(6,"Brangus",new Date(),false);
        cow.getLeatherForClothes();
        printTypeAndAnimal(cow);
        
        farmAnimal = new Sheep(7, "East Friesian", new Date(), new Date());
        printTypeAndAnimal(farmAnimal);
        
        Sheep sheep = new Sheep(8, "Lacaune", new Date(), new Date());
        sheep.sheer();
        printTypeAndAnimal(sheep);
        
        farmAnimal = new Turkey(9, "Beltsville white", new Date(), 0);
        printTypeAndAnimal(farmAnimal);
        
        Turkey turkey = new Turkey(10, "Red Bourbon", new Date(), 0);
        turkey.layAnEgg();
        turkey.layAnEgg();
        turkey.layAnEgg();
        printTypeAndAnimal(turkey);
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("type of farmAnimal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println(farmAnimal);
        System.out.println("-----------------");
    }
}
