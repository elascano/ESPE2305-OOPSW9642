/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.view;

import ec.espe.edu.model.Chicken;
import ec.espe.edu.model.Egg;
import ec.espe.edu.model.Poop;
import java.util.Date;


/**
 *
 * @author USER
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setName("Jhordy");
        chicken.setColor("blue and black");
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("This chicken is " + chicken);
        
        
    }
}
