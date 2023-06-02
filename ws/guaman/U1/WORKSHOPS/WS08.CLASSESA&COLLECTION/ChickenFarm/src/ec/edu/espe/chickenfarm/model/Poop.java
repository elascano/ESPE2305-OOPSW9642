/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class Poop {
    private int poop;

    public Poop(int poop) {
        this.poop = poop;
    }

    @Override
    public String toString() {
        return "Poop{" + "poop=" + poop + '}';
    }
    

    /**
     * @return the poop
     */
    public int getPoop() {
        return poop;
    }

    /**
     * @param poop the poop to set
     */
    public void setPoop(int poop) {
        this.poop = poop;
    }
    
    
}
