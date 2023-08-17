/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calc.view;

import ec.edu.espe.calc.controller.BasicOperation;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        
        float sum;
        sum = basicOperation.add(addend1,addend2);
        System.out.println("sum of " + addend1 + " + " + addend2 + "--> " + sum);
        
        
        float minuend = 0.0F;
        float subtrahend = 1.0F;
        
        float difference;
        difference = basicOperation.subtruct(minuend, subtrahend);
        System.out.println("rest of " + minuend + " - " + subtrahend + "--> " + difference);
        
    }
}
