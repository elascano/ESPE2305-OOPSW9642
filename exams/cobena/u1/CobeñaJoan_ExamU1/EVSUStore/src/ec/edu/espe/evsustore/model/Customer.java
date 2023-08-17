
package ec.edu.espe.evsustore.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Customer {
    private int id;
    private String name;
    private String lastName;
    private int phoneNumber;
    private int idCardNumber;

    public Customer() {
    }
    
    public Customer(int id, String name, String lastName, int phoneNumber, int idCardNumber) {
        this.id = generateId();
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.idCardNumber = idCardNumber;
    }
    
    public int generateId(){
        
        return 0;
    }
    
}
