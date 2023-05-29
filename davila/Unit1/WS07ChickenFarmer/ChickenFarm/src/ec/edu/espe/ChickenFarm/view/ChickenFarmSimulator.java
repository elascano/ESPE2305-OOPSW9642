/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenFarm.view;

import ec.edu.espe.ChickenFarm.model.Chicken;
import ec.edu.espe.ChickenFarm.model.ChickenFarmer;
import ec.edu.espe.ChickenFarm.model.Coop;
import ec.edu.espe.ChickenFarm.model.Egg;
import ec.edu.espe.ChickenFarm.model.Poop;

/**
 *
 * @author Anabel Davila, killChainTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] arg){
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        name="Anabel Davila";
        int numberOfEgg;
        chicken= new Chicken();
        numberOfEgg=0;
        System.out.println("This name is the Chicken -->"+chicken);
        
        System.out.println("This name is the Chicken -->"+name);
        
        System.out.println("This name is the Chicken -->"+numberOfEgg);
    }
}
