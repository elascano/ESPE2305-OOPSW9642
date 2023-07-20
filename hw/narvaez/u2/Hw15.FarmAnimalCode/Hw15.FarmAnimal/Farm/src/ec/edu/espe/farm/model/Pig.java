/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO-ESPE
 */
public class Pig extends FarmAnimal implements IMeat{

    private int groundMeat;

    public Pig(int groundMeat, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.groundMeat = groundMeat;
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() + "groundMeat=" + groundMeat + '}';
    }



    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 50;
    }

    @Override
    public void makeGroundMeat() {
        groundMeat =+1;
    }

    /**
     * @return the groundMeat
     */
    public int getGroundMeat() {
        return groundMeat;
    }

    /**
     * @param groundMeat the groundMeat to set
     */
    public void setGroundMeat(int groundMeat) {
        this.groundMeat = groundMeat;
    }
    
}
