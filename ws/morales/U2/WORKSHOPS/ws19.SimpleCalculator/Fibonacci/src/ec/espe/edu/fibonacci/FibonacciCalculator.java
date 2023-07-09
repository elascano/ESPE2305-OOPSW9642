package ec.espe.edu.fibonacci;

import java.util.Scanner;


/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class FibonacciCalculator { 
    public static int fibonacci(int elements){
        Scanner entry = new Scanner(System.in);
        /*
        System.out.println("Enter the number of elements in the series:");
        elements = entry.nextInt();
        System.out.println("Print.");
        */
        int cont= 0;
        int frselement = 1;
        int scdelement = 0;
        int result;
        
        for(int i = 0; i< elements ; i++){
            //System.out.println(frselement);
            System.out.println("----------");
            scdelement = scdelement + frselement;
            frselement = scdelement - frselement;
            result = frselement + scdelement;
            System.out.println(result);
        }
        return scdelement;
    }
}

