
package ec.espe.edu.SemicircleArea.model;

import java.util.Scanner;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class CalculateSemicircleArea {
    private double radius;
        
    public CalculateSemicircleArea(double radius) {
        
        this.radius = radius;
    }
    
   public double CalculateArea () {
     return (Math.PI * Math.pow(radius, 2)) / 2;
   }   
   
   public double getRadius(){
     return this.radius;
   }

   public void setRadius(double radius){
     this.radius = radius;
   }
}

