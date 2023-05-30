package ec.edu.espe.chickenFarm.model;

import java.util.ArrayList;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Coop {
   private int id;
   private final ArrayList<Chicken> chickens;

    public Coop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "Coop{" + "id=" + id + ", chickens=" + chickens + '}';
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
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
}