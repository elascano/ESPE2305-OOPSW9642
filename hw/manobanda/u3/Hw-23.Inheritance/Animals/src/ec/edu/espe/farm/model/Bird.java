/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author jnman
 */
public abstract class Bird extends Animal{
    private ArrayList<Feather> fet;
    private Beak[] beak;

    public Bird (ArrayList<Feather> fet, Beak[] beak, Claw[] claw){
   // super (claw);
    this.fet = fet;
    this.beak = beak;
    beak=new Beak [1];
    }
    
}