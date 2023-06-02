/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.Ws08Collections.view;

import espe.edu.ec.Ws08Collections.model.Chicken;
import espe.edu.ec.Ws08Collections.model.Coop;
import espe.edu.ec.Ws08Collections.model.Egg;
import espe.edu.ec.Ws08Collections.model.Poop;
import java.util.ArrayList;
import java.util.Date;
//LocalTime, Calendar
/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
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
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(120, 2, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "maruja", "w", true, new Date(121, 11, 1));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(8, "Lulu", "Blue", true, new Date(122, 10, 7));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(9, "Rebeca", "W&Red", false, new Date(120, 9, 12));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(10, "Ana", "Black", true, new Date(121, 8, 14));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(11, "Lily", "Brown", false, new Date(122, 7, 27));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(12, "Diana", "White", true, new Date(120, 6, 6));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);        
        System.out.println("chickens size --> " + chickens.size());
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("coop --> " + coop);
        
        coop2 = new Coop(2, chickens2);
        
        chicken = new Chicken(3, "Juana", "Blue", true, new Date(121, 1, 27));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(4, "Romaria", "W&Red", false, new Date(122, 0, 19));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(5, "Andrea", "Black", true, new Date(120, 5, 8));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(6, "Ramira", "Brown", false, new Date(121, 8, 10));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        chicken = new Chicken(7, "Pancracia", "White", true, new Date(122, 4, 31));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        System.out.println("coop2 --> " + coop2);
        System.out.println("chickens2 size --> " + chickens2.size());
    }
}

