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
public class Pig extends FarmAnimal {
    private String name;

    public Pig(String name, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.name = name;
    }
    
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 50;
    }
    public void TrackTruffles(){
        System.out.println(name + " is being prepared for truffle tracking...");
        System.out.println("Training " + name + " to detect truffle scent...");
        System.out.println(name + " is searching for truffles...");
        System.out.println(name + " has found some truffles!");        
    }
}
