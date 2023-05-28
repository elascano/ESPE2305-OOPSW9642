/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop pooop;
        String name;
        
        chicken = new Chicken();
        name = "Yeshua Chiliquinga";
        int numberOfEggs;
        
        numberOfEggs = 0;
        System.out.println("This is the chicken -->" + chicken);
        
        System.out.println("The name is  --> " + name);
        
        System.out.println("This is the number of eggs-->" + numberOfEggs);
        
        
    }
}
