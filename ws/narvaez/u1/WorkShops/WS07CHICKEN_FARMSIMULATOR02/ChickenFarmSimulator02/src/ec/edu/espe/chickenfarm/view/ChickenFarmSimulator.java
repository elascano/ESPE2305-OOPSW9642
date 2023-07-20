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
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        int number0fEggs;
        
        chicken = new Chicken();
        name="Leonardo Narvaez";
        number0fEggs=0;
        System.out.println("This is the chicken -->"+ chicken);
        System.out.println("The name is -->" +name);
        System.out.println("This is the number of eggs--> "+number0fEggs);
    }
}
