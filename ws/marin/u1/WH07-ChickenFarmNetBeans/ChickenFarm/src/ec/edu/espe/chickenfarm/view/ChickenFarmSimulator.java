/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Poop;
import ec.edu.espe.chickenfarm.model.Egg;
/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main (String[]args){
     Chicken chicken;
     ChickenFarmer chickenfarmer;
     Coop coop;
     Egg egg;
     Poop poop;
     String name;
     int numberOfEgg ;
     chicken = new Chicken();
     name="Josue Marin";
     numberOfEgg=0;
     
     
        System.out.println("This is a chicken -->"+chicken);
        System.out.println("The name is -->"+name);
        System.out.println("This is the of assigned egg -->"+numberOfEgg);        
        
    }
    
}
