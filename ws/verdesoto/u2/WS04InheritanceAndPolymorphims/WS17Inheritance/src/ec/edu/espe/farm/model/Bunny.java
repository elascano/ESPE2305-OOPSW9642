package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Bunny extends FarmAnimal implements Digger{
    
    private int holesDigged;

    public Bunny(int holesDigged, int id, String bredd, Date bornOn) {
        super(id, bredd, bornOn);
        this.holesDigged = holesDigged;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoles Digged=" + holesDigged;
    }

    
    @Override
    public int produce() {
        return 5;
    }
    public int produce (Meat meat){
        return meat.getPounds();
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public void digAHole() {
        holesDigged = holesDigged + 1;
    }

    /**
     * @return the holesDigged
     */
    public int getHolesDigged() {
        return holesDigged;
    }

    /**
     * @param holesDigged the holesDigged to set
     */
    public void setHolesDigged(int holesDigged) {
        this.holesDigged = holesDigged;
    }
    
}
