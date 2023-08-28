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
public abstract class Animal {
    private Date borOn;

    public Animal(Date borOn) {
        this.borOn = borOn;
    }
    
    public abstract void born ();
    public abstract boolean feed();
    public int getAge() {
       return 0;
    }
    
}
