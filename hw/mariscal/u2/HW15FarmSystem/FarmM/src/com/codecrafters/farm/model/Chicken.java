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
public class Chicken extends FarmAnimal implements IBird {  
    boolean isMolting;
    int laidEggs;


    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 4;
    }

    @Override
    public void layAnEgg() {
        laidEggs= laidEggs+1;
    }

    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    public int produce(Meat meat){
        return meat.getPounds();
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public int getLaidEggs() {
        return laidEggs;
    }

    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Date getBornOn() {
        return bornOn;
    }

    @Override
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + "isMolting=" + isMolting + ", laidEggs=" + laidEggs + '}';
    }

    
    
    
}
