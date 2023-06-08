
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Poop {
    private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }
    
    public Poop() {
    }
    
    public Poop(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
