package ec.edu.espe.tax;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class TwoTenthsRounding {
    public static float roundToTwoTenths (float totalAmount) {
        float amountRounded;
        float cents = totalAmount%1;
        
            if(cents == 0.0F){
                amountRounded = totalAmount;
            }
            else {
                int dollars = (int) totalAmount;
                while (cents < 10.0F){
                    cents = cents*10;
                }
                
                float fractionCents = cents%1;
                if (fractionCents >= 0.5F ){
                    cents = cents + 1;
                }
                
                int roundedCents = (int) cents;
                
                amountRounded = dollars + (roundedCents/100.0F);
            }
        
        return amountRounded;
    }
}
