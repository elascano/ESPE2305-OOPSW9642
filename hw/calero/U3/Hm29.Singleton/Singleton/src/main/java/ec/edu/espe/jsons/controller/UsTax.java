
package ec.edu.espe.jsons.controller;

/**
 *
 * @author Usuario
 */
public class UsTax {
    
    private static UsTax instance;
    private float tax = 15;
    private UsTax(){
    };
    
    public static UsTax getInstance(){
        if(instance == null)
            instance = new UsTax();
        return instance;
    }
    
    public float computesalesTotal(float price){
        return price*((tax+100)/100);
    }
    
    public void updateTax(float newTax){
        tax = newTax;
    }
}
