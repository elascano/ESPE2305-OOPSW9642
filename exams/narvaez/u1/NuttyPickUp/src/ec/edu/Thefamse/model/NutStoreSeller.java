package ec.edu.Thefamse.model;

/**
 *
 * @author The FAMSE
 */
public class NutStoreSeller {
    private int id;
    private String name;
    private String contact;

    public NutStoreSeller(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
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
    
            
}
