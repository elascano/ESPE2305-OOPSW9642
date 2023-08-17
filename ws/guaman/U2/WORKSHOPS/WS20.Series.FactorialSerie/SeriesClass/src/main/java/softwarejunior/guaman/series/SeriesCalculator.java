/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwarejunior.guaman.series;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class SeriesCalculator {
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
        static {
        int number = 5;
        long factorial = factorial(number);
        System.out.println("El factorial de " + number + " es: " + factorial);
    }

    private static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    
}
