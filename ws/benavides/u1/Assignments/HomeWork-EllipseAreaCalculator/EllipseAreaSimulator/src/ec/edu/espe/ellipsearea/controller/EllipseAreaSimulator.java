package ec.edu.espe.ellipsearea.controller;

import ec.edu.espe.ellipsearea.model.EllipseArea;
import ec.edu.espe.ellipsearea.model.EllipseAreaCSVFile;
import ec.edu.espe.ellipsearea.view.Interface;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class EllipseAreaSimulator {
    public static void main(String[] args) {
        
        Interface optionValidator = new Interface();
        optionValidator.request();
        
        EllipseArea ellipseArea = new EllipseArea();    
        
        EllipseAreaCSVFile ellipseAreaData = new EllipseAreaCSVFile();
        ellipseAreaData.writeHeader();
                
        while(optionValidator.option != 3){


            if(optionValidator.option == 1){
            
                ellipseArea.getMajorAndMinurRadius();
                ellipseArea.calculate(ellipseArea.getMajorRadiusValue(), ellipseArea.getMinurRadiusValue());
                
            }
            
            if(optionValidator.option == 2){
            
                ellipseAreaData.writeAndRead(ellipseArea.getMajorRadiusValue(), ellipseArea.getMinurRadiusValue(), ellipseArea.getResult());
                
            }
            
            optionValidator.request();
            
            if(optionValidator.option == 3){
            
                System.out.println("Thanks for using my system!");
                
            }
        }
    }
}
