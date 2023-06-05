
package ec.edu.espe.hw08.chickenfarmjson.model;

import java.util.ArrayList;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Coop {
    private int id;
    private ArrayList <Chicken> chickens;

    @Override
    public String toString() {
        return "{id=" + id + "\nchickens=\n" + chickens + '}';
    }

    public Coop() {
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
