/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal = farmAnimal;
        farmAnimal = new Chicken(true,0,1,"pekines", new Date());
        System.out.println("chicken---> "+farmAnimal);
        farmAnimal.produce();
        
        
        Chicken chicken = new Chicken(true, 0, 2, "polish", new Dare() );
        chicken.produce(meat);
        System.out.println("new Chicken  ->"+chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        chicken.layAnEgg();
        
        
    }
    
}
