
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Poop {
    private int id;

    public Poop(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }
  
        
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }    
}
