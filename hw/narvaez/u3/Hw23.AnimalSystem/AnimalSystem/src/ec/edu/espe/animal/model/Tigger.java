/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author NarvaezLeonardo
 */
public abstract class Tigger extends Mammal{

    public Tigger(Date borOn) {
        super(borOn);
    }

   
    @Override
    public String toString() {
        return "Tigger{" + '}';
    }
    
}
