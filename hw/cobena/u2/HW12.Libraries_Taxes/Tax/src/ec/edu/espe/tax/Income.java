
package ec.edu.espe.tax;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Income {
    public static float computeIR(float mensualIncome){
        float totalIncome = mensualIncome * 12;
        float basicFractionTax = 0.0F;
        float surplusFractionPercentage = 0.0F;
        float excedentOver = 0.0F;
        
 
        if(totalIncome > 11722.0F && totalIncome <= 14935.0F){
            basicFractionTax = 0.0F;
            surplusFractionPercentage = 5.0F/100F;
            excedentOver = 11722.0F;
        } 
        else if (totalIncome > 14935.0F && totalIncome <= 18666.0F){
            basicFractionTax = 161.0F;
            surplusFractionPercentage = 10.0F/100F;
            excedentOver = 14935.0F;
        }
        else if (totalIncome > 18666.0F && totalIncome <= 22418.0F){
            basicFractionTax = 534.0F;
            surplusFractionPercentage = 12.0F/100F;
            excedentOver = 18666.0F;
        }
        else if (totalIncome > 22418.0F && totalIncome <= 32783.0F){
            basicFractionTax = 984.0F;
            surplusFractionPercentage = 15.0F/100F;
            excedentOver = 22418.0F;
        }
        else if (totalIncome > 32783.0F && totalIncome <= 43147.0F){
            basicFractionTax = 2539.0F;
            surplusFractionPercentage = 20.0F/100F;
            excedentOver = 32783.0F;
        }
        else if (totalIncome > 43147.0F && totalIncome <= 53512.0F){
            basicFractionTax = 4612.0F;
            surplusFractionPercentage = 25.0F/100F;
            excedentOver = 43147.0F;
        }
        
        else if (totalIncome > 53512.0F && totalIncome <= 63876.0F){
            basicFractionTax = 7203.0F;
            surplusFractionPercentage = 30.0F/100F;
            excedentOver = 53512.0F;
        }
        else if (totalIncome > 63876.0F && totalIncome <= 103644.0F){
            basicFractionTax = 10312.0F;
            surplusFractionPercentage = 35.0F/100F;
            excedentOver = 63876.0F;
        }
        else if (totalIncome > 103644.0F){
            basicFractionTax = 24231.0F;
            surplusFractionPercentage = 37.0F/100F;
            excedentOver = 103644.0F;
        }
            
        float excedent = totalIncome - excedentOver;    
        float surplusFractionTax = excedent * surplusFractionPercentage;    
        float IR = basicFractionTax + surplusFractionTax;
        
        return TwoTenthsRounding.roundToTwoTenths(IR);
    }
}
