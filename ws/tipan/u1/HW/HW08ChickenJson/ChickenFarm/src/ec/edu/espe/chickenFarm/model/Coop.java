package ec.edu.espe.chickenFarm.model;

import java.util.ArrayList;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */


public class Coop {
    private final int id;
    private final ArrayList<Chicken> chickens;

    public Coop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
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
