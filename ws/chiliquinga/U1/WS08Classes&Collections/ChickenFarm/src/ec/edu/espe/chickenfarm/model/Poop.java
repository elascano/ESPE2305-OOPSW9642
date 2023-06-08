package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Poop {
    private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + getId() + '}';
    }
    
    public Poop(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
