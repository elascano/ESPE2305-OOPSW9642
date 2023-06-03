package ec.edu.espe.chickenfarmjson.model;

import java.util.ArrayList;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Coop {
    private int id;
    private ArrayList<Chicken> chickens;

    @Override
    public String toString() {
        return "Coop{" + "id=" + id + 
                ", chickens=" + chickens + '}';
    }

    public Coop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    
    
}
