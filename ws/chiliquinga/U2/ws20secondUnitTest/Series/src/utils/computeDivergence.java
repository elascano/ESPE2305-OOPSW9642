package utils;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class computeDivergence {
    public static int calcultedivergence(int n) {
        if (n % 2 ==0){
            return -n/2;
        } else {
            return (n + 1)/2;
        }
    }
}
