package ec.edu.espe.videogames.view;

import com.codewarriors.tax.sales.SalesTax;
import ec.edu.espe.videogames.model.Owner;
import ec.edu.espe.videogames.model.Videogame;
import java.util.Scanner;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class VideogameSalesSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Videogame videogame;
        int id;
        String name;
        String platform;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        float icePercentage;
        icePercentage = 35.0F;
        float totalPrice;
        Owner owner;
        double salary;
        double annualSalary;
        double netSalary;
        double totalSalary;
        double taxesToPay;
      
        System.out.println("Edison Verdesoto Videogames Saller");
        System.out.println("Input the videogame ID: ");
        id = sc.nextInt();
        System.out.println("Input the videogame Name: ");
        name = sc.next();
        System.out.println("Input the videogame Platform: ");
        platform = sc.next();
        System.out.println("Input the videogame Price: ");
        price = sc.nextFloat();
        
        totalPrice = SalesTax.computeIce(price, icePercentage, ivaPercentage);
        videogame = new Videogame(id, name, platform, price, totalPrice);
        System.out.println("videogame--->" + videogame);        
        
        System.out.println("Input the owner Salary: ");
        salary = sc.nextDouble();
        annualSalary = salary*12;
        taxesToPay = SalesTax.computeIncomeTax(annualSalary);
        totalSalary = salary - taxesToPay;
        owner = new Owner(1, "Edison", salary, taxesToPay, totalSalary);
        System.out.println("Owner Data ---->" + owner);        
    }
}
