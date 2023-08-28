/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatepattern.model;

import javax.swing.JOptionPane;

/**
 *
 * @author NarvaezLeonardo
 */
public abstract class CaffeineBeverage {
    
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) { 
            addCondiments(); 
        }
    }
    
    public void boilWater() { 
            JOptionPane.showMessageDialog(null, "Bolling Water");
    }
    public abstract void brew();
    
    public void pourInCup () { 
            JOptionPane.showMessageDialog(null, "Pouring into cup");
    }
    
    public abstract void addCondiments();
    
    public boolean wantsCondiments() {
        return true;
    }
}