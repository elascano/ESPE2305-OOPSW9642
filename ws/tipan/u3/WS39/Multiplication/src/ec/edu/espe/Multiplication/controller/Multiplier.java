
package ec.edu.espe.Multiplication.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class Multiplier {
    
    private static Multiplier instance;

    private Multiplier() {
        
    }

    public static Multiplier getInstance() {
        if (instance == null) {
            instance = new Multiplier();
        }
        return instance;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
 
