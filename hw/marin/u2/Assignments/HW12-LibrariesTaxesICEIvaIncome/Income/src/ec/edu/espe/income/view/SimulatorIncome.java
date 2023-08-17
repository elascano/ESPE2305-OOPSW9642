
package ec.edu.espe.income.view;
import com.codecrafters.tax.ice.IncomeTax;
import java.util.Scanner;
/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class SimulatorIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly income: ");
        float ingresoMensual = scanner.nextFloat();

        float ingresoAnual = ingresoMensual * 12; 

        float impuesto = IncomeTax.calcularImpuesto(ingresoAnual, 0.0F);

        System.out.println("Annual income:: " + ingresoAnual);
        System.out.println("Income tax:" + impuesto);

        scanner.close();
    }
}
