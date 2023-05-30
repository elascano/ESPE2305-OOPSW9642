package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;

/**
 *
 * @author Mesias Mariscal, Jsons, DCCO-ESPE
 */
public class Coop {

    private int id;
    private ArrayList<Chicken> chickens;

    public Coop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "Coop{" + "id=" + id + 
                ", chickens=" + chickens + '}';
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

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    
    
}
