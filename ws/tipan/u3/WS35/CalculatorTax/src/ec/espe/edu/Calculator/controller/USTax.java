package ec.espe.edu.Calculator.controller;

/**
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    
    private USTax() {
       
    }
    
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }
    
    public float salesTotal(float subtotal, float taxRate) {
      
        float total = subtotal * (1 + taxRate / 100);
        return total;
    }
}
