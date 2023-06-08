
package espe.edu.ec.Ws08Collections.model;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class Poop {
    private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }

    public Poop(int id) {
        this.id = id;
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
    
    
}
