package utils;

import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class divergence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of test cases: ");
        int testCases = sc.nextInt();
        
        for(int i = 1; i <= testCases; i++){
            computeDivergence compute = new computeDivergence();
            int result = compute.calcultedivergence(i);
            System.out.println("Case " + i + ": "+ result);
        }
    }
}
