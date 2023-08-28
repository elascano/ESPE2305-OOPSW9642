package ec.edu.espe.series;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Series {
    public static int computeFactorial(int factorialNumber) {
        int factorial = 1;
        
        if(factorialNumber == 0){
            
        }
        else if(factorialNumber < 0){
           factorial = 0; 
        }
        else{
            for(int i = factorialNumber; i > 0; i--){
                factorial *= i;
            }
        }
        
        return factorial;
    }
    
    public static int computeDivergence(int quantityOfNumbers) {
        int divergence = 0;
        
        if(quantityOfNumbers <= 0){
            
        }
        else {
            int serieNumber;
            for(int i = 1; i <= quantityOfNumbers; i++){
                serieNumber = i;
                if (i % 2 == 0){
                    serieNumber=serieNumber*(-1);
                }
                
                System.out.print(serieNumber + ", ");
                
                divergence += serieNumber;
            }
            System.out.println("");
        }
        
        return divergence;
    }
}
