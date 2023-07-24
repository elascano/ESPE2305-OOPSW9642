package AddenSeries;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class DivergentCalculator {
    public static int divergentCalculator(int divergentNumber){
        
        int result = 0;
        for (int i = 1; i <= divergentNumber; i++) {
            if (i % 2 == 0) {
                result -= i;
            } else {
                result += i;
            }
        }
        return result;
    }
}
