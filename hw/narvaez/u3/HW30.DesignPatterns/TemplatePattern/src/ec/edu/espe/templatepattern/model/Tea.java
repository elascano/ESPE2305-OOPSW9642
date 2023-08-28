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
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        JOptionPane.showMessageDialog(null,"Steep the tea");
    }

    @Override
    public void addCondiments() {
        JOptionPane.showMessageDialog(null,"Adding lemon");
    }

    @Override
    public boolean wantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    public String getUserInput() {
        String answer = JOptionPane.showInputDialog(null, "Would you like lemon with your tea (y/n)?").toLowerCase();
        return answer;
    }

    @Override
    public void prepareRecipe() {
        boilWater();
        brew();
        if (wantsCondiments()) {
            addCondiments();
        }
        pourInCup();
    }
    
   
}


