/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.animal.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NarvaezLeonardo
 */
public class Bird extends Animal{
    ArrayList<Feather> feather;
    Beak[] beak = new Beak [1];
    public Bird(Date borOn) {
        super(borOn);
    }

   

    @Override
    public void born() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
