
package espe.edu.ec.model;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
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

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
