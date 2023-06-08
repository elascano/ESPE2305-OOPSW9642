package ec.edu.Thefamse.model;

import java.util.Scanner;

/**
 *
 * @author The FAMSE
 */
public class NutProduct {
    private int id;
    private String name;
    private String category;
    private double price;

    public NutProduct(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
              public static NutProduct addProduct() {
                       Scanner scanner = new Scanner(System.in);

                       System.out.println("Ingrese el ID del producto: ");
                       int id = scanner.nextInt();
                                    
                       System.out.println("Ingrese el tipo del producto (Salado/Dulce):");
                       String category = scanner.next();
                       
                       System.out.println("Ingrese el nombre del producto: ");
                       String name = scanner.next();

                       System.out.println("Ingrese el precio del producto (Ejemplo: 0,10): ");
                       double price = scanner.nextDouble();
                       while(price<0){
                           System.out.println("Precio erroneo, ingrese de nuevo: ");
                             price = scanner.nextDouble();
                       }

                       return new NutProduct(id, name, category, price);
    }

    @Override
    public String toString() {
        return "NutProduct{" + "id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + '}';
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }


    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
