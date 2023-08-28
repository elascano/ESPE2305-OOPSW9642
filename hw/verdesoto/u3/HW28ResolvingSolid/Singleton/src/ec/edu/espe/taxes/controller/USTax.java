package ec.edu.espe.taxes.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
    private float tax;
    private float price;

    private USTax() {
        tax = 0.0f;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public void recordSales(float amount) {
    }
    
    public float calculateTax(float tax, float price){
        float pvp;
        return pvp= (tax/100+1)*price;
    }
 }
