package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Coop {
    private int id;
    private ArrayList<Chicken>chicken;

    public Coop(int id, ArrayList<Chicken> chicken) {
        this.id = id;
        this.chicken = chicken;
    }

    @Override
    public String toString() {
        return "Coop{" + "id=" + id + ", chicken=" + chicken + '}';
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
     * @return the chicken
     */
    public ArrayList<Chicken> getChicken() {
        return chicken;
    }

    /**
     * @param chicken the chicken to set
     */
    public void setChicken(ArrayList<Chicken> chicken) {
        this.chicken = chicken;
    }
    
}
