
package ec.edu.espe.hw08.chickenfarmjson.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Egg {
    private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }

    public Egg(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
