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
public class Goat extends FarmAnimal implements IShear {

    public Goat(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public void shear() {
    System.out.println("Preparing the goat for shearing...");
    System.out.println("Carefully cutting the goat's hair...");
    System.out.println("Collecting the sheared hair...");
    System.out.println("The goat has been successfully sheared!");    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 23;
    }

}
