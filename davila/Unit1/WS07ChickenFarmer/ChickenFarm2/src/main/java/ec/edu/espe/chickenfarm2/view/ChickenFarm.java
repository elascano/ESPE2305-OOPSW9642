/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm2.view;

import ec.edu.espe.chickenfarm2.model.Chicken;
import ec.edu.espe.chickenfarm2.model.Coop;
import ec.edu.espe.chickenfarm2.model.Egg;
import ec.edu.espe.chickenfarm2.model.Poop;
import java.util.ArrayList;
import java.util.Date;
//LocalTime,Calendar
/**
 *
 * @author Anabel Davila, killChainTeam, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        
                
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "maruja", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(8, "Lulu", "Blue", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(9, "Rebeca", "W&Red", false, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(10, "Ana", "Black", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(11, "Lily", "Brown", false, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(12, "Diana", "White", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);        
        System.out.println("chickens size --> " + chickens.size());
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("coop --> " + coop);
        
        coop2 = new Coop(2, chickens2);
        
        chicken = new Chicken(3, "Juana", "Blue", true, new Date());
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(4, "Romaria", "W&Red", false, new Date());
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(5, "Andrea", "Black", true, new Date());
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(6, "Ramira", "Brown", false, new Date());
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(7, "Pancracia", "White", true, new Date());
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        System.out.println("coop2 --> " + coop2);
        System.out.println("chickens2 size --> " + chickens2.size());

    }
}