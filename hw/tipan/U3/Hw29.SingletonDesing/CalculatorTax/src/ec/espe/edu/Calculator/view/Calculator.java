package ec.espe.edu.Calculator.view;

import ec.espe.edu.Calculator.controller.USTax;


/**
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Calculator {
    public static void main(String args[]) {
        USTax tax = USTax.getInstance();
        
        float subtotal = 100.0f; 
        float taxRate = 8.0f;   
        
        float total = tax.salesTotal(subtotal, taxRate);
        System.out.println("Total amount with tax: $" + total);
    }
}
