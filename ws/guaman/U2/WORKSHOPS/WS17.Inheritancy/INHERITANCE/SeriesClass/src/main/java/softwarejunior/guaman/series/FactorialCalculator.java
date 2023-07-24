
package softwarejuniors.guaman.series;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class FactorialCalculator {
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
