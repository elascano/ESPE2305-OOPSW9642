package espe.edu.ec.calculate.controller;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
    private float tax=0;

    private USTax() {
    tax=12.0f;

    }
    public  void updateTax(float newTax){
    tax=newTax;
    
    }
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float computesalesTotal(float[] sales, float ivaRate) {
        float totalIVA = 0.0f;
        for (float sale : sales) {
            float ivaAmount = (sale * ivaRate) / 100;
            totalIVA = ivaAmount;
        }
        return totalIVA;
    }
}
