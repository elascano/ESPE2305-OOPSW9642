package ec.edu.espe.calc.model;

import ec.edu.espe.calc.view.BasicOperation;

/**
 *
 * @author Carlos Jaya, Software Juniors; DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        
        float minuend = 0.0F;
        float subtrahend = 1.0F;
        float difference;
        
        float sum;
        sum = basicOperation.add(addend1, addend2);
        difference = basicOperation.subtruct(minuend, subtrahend);
        
        System.out.println("sum f" + addend1 + "+" + addend2 + "=" + sum);
        System.out.println("dif df " + minuend + "-" + subtrahend + "=" + difference);
    }
}
