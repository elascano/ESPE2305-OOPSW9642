package ec.espe.edu.shoes.view;

import com.softwarejuniors.tax.SalesTax;
import ec.espe.edu.shoes.model.Customer;
import java.util.Scanner;


/**
 *
 * @author Caetano Flores, Software Juniors, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
      
        String name;
        float salary;
        float videogamePrice = 20;
        float videogameAmount;
        float totalIncomeTax;
        float totalSalary;
      
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("Enter your mensual salary: ");
        salary = scanner.nextFloat();
        System.out.println("How many videogames are you going to buy: ");
        videogameAmount = scanner.nextFloat();
        
        totalIncomeTax = SalesTax.computeIncomeTax(salary);
        totalSalary = salary - totalIncomeTax;
        
        videogamePrice += SalesTax.ComputeIce(videogamePrice, 35);
        videogamePrice *= videogameAmount;
        
        totalSalary -= videogamePrice;
        
        Customer customer = new Customer(name, salary, totalSalary);
        System.out.println("SUELDO TOTAL DESCONTADO VIDEOJUEGOS: \n"+customer);
        
       
    }
      
}
