package AddenSeries;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class FactorialCalculator {
     public static int factorialCalculator(int factorialNumber){
        int result = 1;
            if (factorialNumber > 0){
                for (int i=1;i<=factorialNumber;i++){
                    result *=i;   
                }
            }else {
                System.out.println("Factorial of a negative number doesn't exist");
            }
        return result;
    }  
}
