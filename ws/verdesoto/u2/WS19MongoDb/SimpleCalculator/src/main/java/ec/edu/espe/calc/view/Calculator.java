package ec.edu.espe.calc.view;

import ec.edu.espe.calc.controller.BasicOperation;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float adden1 = 1.2F;
        float adden2 = 3.4F;
        
        float minuend = 0.0F;
        float sustrahend = 1.4F;
        float difference;
        
        
        float sum;
        sum=basicOperation.add(adden1, adden2);
        difference=basicOperation.subtruct(minuend, sustrahend);
        
        System.out.println("sum" + adden1 + "+" + adden2 + "=" +sum);
        System.out.println("difference" + minuend + "+" + sustrahend + "=" +difference);
    }
           
}
