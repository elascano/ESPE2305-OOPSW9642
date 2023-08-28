/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.animal.model;

/**
 *
 * @author NarvaezLeonardo
 */
public class Claw {
    private Claw[] claw = new Claw[20]; 

    public Claw() {
    }

    @Override
    public String toString() {
        return "Claw{" + '}';
    }

    /**
     * @return the claw
     */
    public Claw[] getClaw() {
        return claw;
    }

    /**
     * @param claw the claw to set
     */
    public void setClaw(Claw[] claw) {
        this.claw = claw;
    }
    
}
