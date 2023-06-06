
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Egg {
     private int id;

    public Egg(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
}
