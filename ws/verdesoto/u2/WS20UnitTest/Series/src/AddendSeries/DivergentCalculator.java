package AddendSeries;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class DivergentCalculator {
    public static int divergentCalculator(int divergentNumber){
        int result = 1;
        int number = 1;
            if(divergentNumber >=2 ){
                for (int i=1;i<=divergentNumber;i++){
                    number*=-i;
                    result += number; 
                    }
            }else {
                result = divergentNumber;
            }
        return result;
    } 
}
