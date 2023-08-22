
package ec.edu.espe.taxss.controller;

import ec.edu.espe.taxss.model.USTax;

/**
 *
 * @author USER
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
    
}
