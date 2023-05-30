
package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Coop {
    int id;
    private ArrayList <Chicken> chickens;

    public Coop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "Coop{" + "id=" + id + ", chickens=" + chickens + '}';
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
