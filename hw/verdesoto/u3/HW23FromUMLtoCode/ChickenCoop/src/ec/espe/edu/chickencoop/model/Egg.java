package ec.espe.edu.chickencoop.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Egg {
    int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }

    public Egg(int id) {
        this.id = id;
    }
}
