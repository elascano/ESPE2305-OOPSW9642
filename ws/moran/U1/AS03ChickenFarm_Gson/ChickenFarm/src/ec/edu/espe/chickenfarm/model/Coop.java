package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;

/**
 *
 * @author Moran David
 */
public class Coop {
    private int id;
    private ArrayList<Chicken> chickens;

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
    @Override
    public String toString() {
        return "Coop{" +
                "id=" + id +
                ", chickens=" + chickens +
                '}';
    }
}