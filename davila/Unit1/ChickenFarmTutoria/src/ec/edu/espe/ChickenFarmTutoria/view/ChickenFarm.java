/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenFarmTutoria.view;

import ec.edu.espe.ChickenFarmTutoria.model.Chicken;
import ec.edu.espe.ChickenFarmTutoria.model.Coop;
import ec.edu.espe.ChickenFarmTutoria.model.Egg;
import ec.edu.espe.ChickenFarmTutoria.model.Poop;
import java.util.ArrayList;
import java.util.Date;

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
        chicken = new Chicken(001, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(002, "Julia", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
                
        System.out.println("chickens size --> " + chickens.size());
        coop = new Coop(001, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("coop --> " + coop);
        
        coop2 = new Coop(002, chickens2);
        
        chicken = new Chicken(003, "Petrona", "Red", true, new Date());
        chickens2.add(chicken);
        chicken = new Chicken(004, "Patricia", "ink", true, new Date());
        chickens2.add(chicken);
        chicken = new Chicken(005, "Mary", "White", true, new Date());
        chickens2.add(chicken);
        chicken = new Chicken(006, "Camila", "Lead", false, new Date());
        chickens2.add(chicken);
        chicken = new Chicken(007, "Chimoltrufia", "Brown", false, new Date());
        chickens2.add(chicken);
        System.out.println("coop2 --> " + coop2);

    }
}