/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package chickenfarm;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class ChickenFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        String name;
        int number0fEgg;
        chicken = new Chicken();
        name= "Mesias Mariscal";
        number0fEgg=0;
        System.out.println("This is chicken -->" + chicken);
        System.out.println("The name is -->" + name);
        System.out.println("This is the number of assigned egg-->" + number0fEgg);
    }

}
