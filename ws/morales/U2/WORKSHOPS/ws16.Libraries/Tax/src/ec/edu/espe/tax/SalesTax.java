package ec.edu.espe.tax;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }

    public static float computeIce(float pack, float cigarette, float icePercentage){
        float totalAndIce;
        totalAndIce = pack * cigarette * icePercentage/100;
        return totalAndIce;
    }
    
    public static float computeIr(float salary){
        float totalAndIr = 0.00F;
        float total;
        total = salary * 12;
        if(total > 0 && total < 11722){
            totalAndIr =  salary /12;
        }else if(total > 11723 && total < 14935){
            totalAndIr = ((((14935 - total) * 5/100) + 0) /12);
            
        }else if(total > 14936 && total < 18666){
            totalAndIr = ((((18666 - total) * 10/100) + 161) /12);
            
        }else if(total > 18667 && total < 22418){
            totalAndIr = ((((22418 - total) * 12/100) + 534) /12);
            
        }else if(total > 22419 && total < 32783){
            totalAndIr = ((((32783 - total) * 15/100) + 984) /12);
            
        }else if(total > 32784 && total < 43147){
            totalAndIr = ((((43147 - total) * 20/100) + 2539) /12);
            
        }else if(total > 43148 && total < 53512){
            totalAndIr = ((((53512 - total) * 25/100) + 4612) /12);
            
        }else if(total > 53513 && total < 63876){
            totalAndIr = ((((63876 - total) * 30/100) + 7203) /12);
            
        }else if(total > 63877 && total < 103644){
            totalAndIr = ((((103644 - total) * 35/100) + 10312) /12);
            
        }else if(total > 103645 && total < 150412){
            totalAndIr = ((((150412 - total) * 37/100) + 24231) /12);
            
        }else{
            System.out.println("Cagamos");
        }
        
        return totalAndIr;
    }
}
