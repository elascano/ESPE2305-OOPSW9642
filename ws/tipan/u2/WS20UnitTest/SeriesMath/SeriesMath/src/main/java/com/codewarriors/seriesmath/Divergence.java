package com.codewarriors.seriesmath;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class Divergence {
    public static void serie(int number) {
        int serie = 1;
        for (int i = 0; i < number; i++) {
            int divergence = calculateDivergence(serie);
            serie = numberSerie(serie);
            System.out.print(divergence + ", ");
        }
    }

    public static int calculateDivergence(int number) {
        if (number % 2 == 0) {
            return -number;
        } else {
            return number;
        }
    }

    public static int numberSerie(int number) {
        if (number > 0) {
            return number + 1;
        } else {
            return number - 1;
        }
    }
}
