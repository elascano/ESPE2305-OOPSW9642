
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {
    private Date lastSheering;

    public Sheep(int id, String breed, Date bornOn, Date lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering=lastSheering;
    }

    @Override
    public String toString() {
        return "Sheep{"+super.toString() + " ,lastSheering=" + lastSheering + '}';
    }
    
    public void sheer(){
        System.out.println("Sheered");    
    }

    /**
     * @return the lastSheering
     */
    public Date getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 5;
    }
}
