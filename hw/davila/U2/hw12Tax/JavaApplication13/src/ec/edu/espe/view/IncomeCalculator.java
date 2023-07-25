package ec.edu.espe.view;

import com.edu.espe.tax.sales.ImpuestoRenta;
import ec.edu.espe.model.Income;
import java.util.Scanner;

/**
 * 
 * @Autor: Jhordy Marcillo
 */
public class IncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jhordy Marcillo shoes maker :D");
        
        System.out.print("Ingrese el ingreso anual de la persona: ");
        float ingresoAnual = scanner.nextFloat();
        
        float impuestoRenta = ImpuestoRenta.calcularImpuesto(ingresoAnual, 12.0F);
        
        System.out.println("Ingreso anual ingresado: " + ingresoAnual);
        System.out.println("Impuesto a la renta calculado: " + impuestoRenta);
        

        float price = 20.0F;
        float ivaPercentage = 12.0F;
        float totalPrice = ImpuestoRenta.calcularImpuesto(price, ivaPercentage);
        
        Income ingreso = new Income(1, price, totalPrice, ingresoAnual);
        System.out.println("Impuesto a la renta de: " + ingreso);
    }     
}
