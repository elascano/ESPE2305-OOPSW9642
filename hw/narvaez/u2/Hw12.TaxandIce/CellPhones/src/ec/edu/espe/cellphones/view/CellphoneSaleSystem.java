package ec.edu.espe.cellphones.view;

import com.thefamse.tax.sales.SalesTax;
import ec.edu.espe.cellphones.model.Cellphones;
import ec.edu.espe.cellphones.model.Owner;
import java.util.Scanner;

/**
 *
 * @author Narvaez Leonardo,The FAMSE, DCCO-ESPE
 */
public class CellphoneSaleSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Cellphones cellphone;
        int id;
        String brand;
        String model;
        float price;
        float ivaPercentage = 12.0F;
        float icePercentage = 10.0F;
        float netPrice;
        Owner owner;
        String name;
        float salary;
        float annualSalary;
        float netSalary;
        float taxesToPay;
        System.out.println("Leonardo Narvaez Cellphones seller: ");
        System.out.println("Enter the cellphone Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the cellphone brand: ");
        brand = sc.nextLine();
        System.out.println("Enter the cellphone model: ");
        model = sc.nextLine();
        System.out.println("Enter the cellphone price: ");
        price = sc.nextFloat();
        
            netPrice = SalesTax.computeIce(price, icePercentage, ivaPercentage);
            cellphone = new Cellphones(id, brand, model, price, netPrice);
            System.out.println("Cellphone: "+cellphone);
            
            System.out.println("Enter the salary of owner: ");
            salary = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter the name: ");
            name = sc.nextLine();
            annualSalary = salary*12;
            taxesToPay = SalesTax.computeIncomeTax(annualSalary);
            netSalary = salary - taxesToPay;
            owner = new Owner(id, name, salary, taxesToPay, netSalary);
            System.out.println("Owner: "+owner);
   }
}
