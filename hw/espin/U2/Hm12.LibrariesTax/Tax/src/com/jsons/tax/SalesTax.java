
package com.jsons.tax;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }   
    
    public static float computeIce(float salePrice) {
        float rateICE = 0.35F; // Tasa de ICE (ejemplo: 20%)

        float taxICE = ((salePrice/1.12F)/1.35F) * rateICE;

        System.out.println("The special consumption tax (ICE) is: $" + taxICE);
        return taxICE;
    }
    
    public static float computeIncomeTax(float salary) {
        
       float totalIncomeTax = 0.0F;
       float totalAnualSalary;
       totalAnualSalary = salary*12;
       
       if (totalAnualSalary > 0 && totalAnualSalary<11722){
           
          totalIncomeTax = (0); 
       }else if (totalAnualSalary>11722 && totalAnualSalary<14935){
           
           totalIncomeTax= ((((14935-totalAnualSalary)*5/100)+0)/12);
           
       }else if(totalAnualSalary>14935 && totalAnualSalary<18666){
           
           totalIncomeTax= ((((18666-totalAnualSalary)*10/100)+161)/12);
    
       }else if(totalAnualSalary>18666 && totalAnualSalary<22418){
       
           totalIncomeTax= ((((22418-totalAnualSalary)*12/100)+534)/12);
           
       }else if(totalAnualSalary>22418 && totalAnualSalary<32783){
       
           totalIncomeTax= ((((32783-totalAnualSalary)*15/100)+984)/12);
       
       }else if(totalAnualSalary>32783 && totalAnualSalary<43147){
           
           totalIncomeTax= ((((43147-totalAnualSalary)*20/100)+2539)/12);
      
       }else if (totalAnualSalary>43147 && totalAnualSalary<53512){
           
           totalIncomeTax= ((((53512-totalAnualSalary)*25/100)+4612)/12);
       
       }else if (totalAnualSalary >53512 && totalAnualSalary<63876){
           
           totalIncomeTax= ((((63876-totalAnualSalary)*30/100)+7203)/12);
           
       }else if(totalAnualSalary > 63876 && totalAnualSalary<103644){
      
           totalIncomeTax= ((((103644-totalAnualSalary)*35/100)+10312)/12);
           
       }else if(totalAnualSalary >103644){
           
           totalIncomeTax= ((((totalAnualSalary-103644)*37/100)+24231)/12);
           
       }

    return totalIncomeTax;
    }
}
