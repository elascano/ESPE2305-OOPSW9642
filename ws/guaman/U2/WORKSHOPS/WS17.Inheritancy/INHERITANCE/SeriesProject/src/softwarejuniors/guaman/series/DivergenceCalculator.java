package softwarejuniors.guaman.series;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class DivergenceCalculator {
    public static int divergenceCalculator(int divergentNum) {
        int result = 1;
        int number = 1;
        
        if (divergentNum >= 2) {
            for (int i = 1; i <= divergentNum; i++) {
                number *= -i;
                result += number;
            }
        } else {
            result = divergentNum;
        }
        
        System.out.println("Divergent number: " + result);
        return result;
    }
}

