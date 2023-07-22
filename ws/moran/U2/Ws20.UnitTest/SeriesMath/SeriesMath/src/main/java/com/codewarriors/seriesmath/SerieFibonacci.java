package com.codewarriors.seriesmath;



/**
 *
 * @author David Moran
 */
public class SerieFibonacci {
    public static void calculateSeries(int number) {
    int x = 1;
    int y = 1;
    int z = 0;
    while (x <= number) {
        if (x % 2 == 1) {
            z = z + y;
            System.out.print(z);
        } else {
            y = y + z;
            System.out.print(y);
        }
        x += 1;
    }
}

}

