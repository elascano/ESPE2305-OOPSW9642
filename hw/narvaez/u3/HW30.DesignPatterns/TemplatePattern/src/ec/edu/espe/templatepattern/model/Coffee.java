/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatepattern.model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author NarvaezLeonardo
 */
public class Coffee extends CaffeineBeverage {
    
    @Override
    public void brew() { 
        JOptionPane.showMessageDialog(null, "Dripping coffee through filter"); 
    }

    @Override
    public void addCondiments() { 
        JOptionPane.showMessageDialog(null, "Adding sugar and milk"); 
    }


    @Override
    public boolean wantsCondiments(){
        String answer = getUserInput();
        if ( answer.toLowerCase().startsWith("y")) { 
        return true;
        } else { 
            return false;
        } 
    }
    
    public String getUserInput() {
        String answer = JOptionPane.showInputDialog(null, "Would you like milk and sugar with your coffee (y/n)? ").toLowerCase();
        return answer;
}
}
