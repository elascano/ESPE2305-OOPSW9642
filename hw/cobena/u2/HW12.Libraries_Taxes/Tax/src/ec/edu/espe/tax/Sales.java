
package ec.edu.espe.tax;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Sales {
    
    public static float computeIVA (float totalPrice, float ivaPercentage) {
        float IVA = totalPrice * (ivaPercentage/100.0F);
        return TwoTenthsRounding.roundToTwoTenths(IVA);
    }
    
    public static float getPriceFromIVAIncluded (float priceIVAIncluded, float ivaPercentage) {
        float totalPrice = priceIVAIncluded / (1+(ivaPercentage/100));
        return totalPrice;
    }
    
    public static float computeSodaICE (float totalPrice, float capacityInMl, float gramsOfSugar, float ivaPercentage) {
        float marginOfGain = 30.0F/100.0F;
        float specificBase = (gramsOfSugar/100.0F)*(capacityInMl/1000.0F);
        float specificFee = 0.0F;
        float advaloremBase = getPriceFromIVAIncluded(totalPrice, ivaPercentage)*(1+marginOfGain);
        float advaloremFee = 0.0F;
        
        if(gramsOfSugar == 0){
            specificFee = 0.0F;
        }
        else if ((gramsOfSugar*1000.0F)/capacityInMl > 25.0F){
            specificFee = 0.18F;
        }
        else {
            advaloremFee = 0.1F;
        }
        
        float ICE = (specificBase*specificFee)+(advaloremFee*advaloremBase);
        return TwoTenthsRounding.roundToTwoTenths(ICE);
    }
    
    public static float computeBigScaleIndustrialBeerICE (float totalPrice, float capacityInMl, float alcoholContent, float ivaPercentage) {
        float specificBase = (alcoholContent/100.0F)*(capacityInMl/1000.0F);
        float specificFee = 13.08F;
        float advaloremBase = 0.0F;
        float advaloremFee = 75.0F/100.0F;
        float baseAdvaloremRate = 4.33F;
        
        if ((totalPrice*1000.0F)/capacityInMl > 4.33F){
            advaloremBase = getPriceFromIVAIncluded(totalPrice, ivaPercentage)-baseAdvaloremRate;
        }
        
        
        float ICE = ((specificBase*specificFee)+(advaloremFee*advaloremBase));
        return TwoTenthsRounding.roundToTwoTenths(ICE);
    }
    
    public static float computeCraftBeerICE (float totalPrice) {
        
        
        float totalWithICE = totalPrice;
        return totalWithICE;
    }
}
