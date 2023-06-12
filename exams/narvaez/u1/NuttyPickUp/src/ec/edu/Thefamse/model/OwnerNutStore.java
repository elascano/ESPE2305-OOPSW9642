package ec.edu.Thefamse.model;

/**
 *
 * @author The FAMSE
 */
public class OwnerNutStore {
    private String name;
    private String contact;
    private String store;

    public OwnerNutStore(String name, String contact, String store) {
        this.name = name;
        this.contact = contact;
        this.store = store;
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
     * @return the store
     */
    public String getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(String store) {
        this.store = store;
    }
    
}
