
package operationstest;

import utils.Fibonacci;
import utils.DivergenceSeries;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class OperationTest {

    public static void main(String[] args) {
         int n = 10;

        
        int[] fibonacciSequence = Fibonacci.generateFibonacciSequence(n);
        System.out.println("Secuencia de Fibonacci:");
        for (int number : fibonacciSequence) {
            System.out.print(number + " ");
        }
        System.out.println();

       
        String divergenceSeries = DivergenceSeries.generateSeries(n);
        System.out.println(divergenceSeries);
    }
}
    

