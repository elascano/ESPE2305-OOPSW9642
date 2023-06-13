package ec.edu.Thefamse.model;

import java.util.Scanner;

/**
 *
 * @author The FAMSE
 */
public class NutCustomer {
    private int id;
    private String name;
    private String contact;
    private String orderHistory;
    
    public NutCustomer(int id, String name, String contact, String orderHistory) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.orderHistory = orderHistory;
    }
    
    public static NutCustomer createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su cedula de identidad:");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese su nombre:");
        String name = scanner.next();

        System.out.println("Ingrese su contacto:");
        String contact = scanner.next();

        String orderHistory = ""; 

        return new NutCustomer(id, name, contact, orderHistory);
    }

    @Override
    public String toString() {
        return "NutCustomer{" + "id=" + id + ", name=" + name + ", contact=" + contact + ", orderHistory=" + orderHistory + '}';
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
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the orderHistory
     */
    public String getOrderHistory() {
        return orderHistory;
    }

    /**
     * @param orderHistory the orderHistory to set
     */
    public void setOrderHistory(String orderHistory) {
        this.orderHistory = orderHistory;
    }

}
