package ec.edu.espe.tax;

/**
 *
 * @author leona
 */
public class iva {
    public static float compute(float total, float ivaPercentage){
           float totalAndIva;
           totalAndIva = total+total*ivaPercentage/100;
           return totalAndIva;
    }
    public static float computeIce(float total, float icePercentage){
           float totalAndIce=0.0F;
           return totalAndIce;
    }
}
