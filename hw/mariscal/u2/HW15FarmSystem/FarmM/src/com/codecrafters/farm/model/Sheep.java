/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codecrafters.farm.model;

import java.util.Date;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class Sheep extends FarmAnimal implements IShear {
   // Date court;
    
    public Sheep(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 12;
    }
    public void lastSheering(){
        System.out.println("Court --->>" + new Date());
    }

    @Override
    public void shear() {
    System.out.println("Preparing the sheep for shearing...");
    System.out.println("Carefully cutting the sheep's wool...");
    System.out.println("Collecting the sheared wool...");
    System.out.println("The sheep has been successfully sheared!");

    }
        
}
