package ec.edu.espe.ellipsearea.model;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class EllipseArea {

    private double majorRadiusValue;
    private double minurRadiusValue;
    private double result;
    
    public void getMajorAndMinurRadius(){
    
        while(true){
            
            //exception for major radius
            try{
            
                System.out.println("Write the major radius (separate decimals with ',' not with '.'): ");
                Scanner majorRadiusScannerData = new Scanner(System.in);
                double majorRadius = majorRadiusScannerData.nextDouble();
                if(majorRadius < 0){
                    System.out.println("Error: There is not a negative radius. Try again.");
                    getMajorAndMinurRadius();
                    break;
                }
                this.majorRadiusValue = majorRadius;
                
            }catch(Exception e){
                
                System.out.println("Error: You can only enter numbers. Try again. ");
                getMajorAndMinurRadius();
                break;
            }
            
            //exception for minur radius
            try{
            
                System.out.println("Write the minur radius (separate decimals with ',' not with '.'): ");
                Scanner minurRadiusScannerData = new Scanner(System.in);
                double minurRadius = minurRadiusScannerData.nextDouble();
                if(minurRadius < 0){
                    System.out.println("Error: There is not a negative radius. Try again.");
                    getMajorAndMinurRadius();
                    break;
                }
                this.minurRadiusValue = minurRadius;
                break;
                
            }catch(Exception e){
                
                System.out.println("Error: You can only enter numbers. Try again. ");
                getMajorAndMinurRadius();
                break;
            }
      
        }
        
    }
    
    public double getMajorRadiusValue() {
        return majorRadiusValue;
    }

    public double getMinurRadiusValue() {
        return minurRadiusValue;
    }

    public void calculate(double majorRadiusValue, double minurRadiusValue){
        
        this.result = PI * majorRadiusValue * minurRadiusValue;
        
    }
    
    /**
     * @return the result
     */
    public double getResult() {
        return result;
    }
    

    
    
    

}
