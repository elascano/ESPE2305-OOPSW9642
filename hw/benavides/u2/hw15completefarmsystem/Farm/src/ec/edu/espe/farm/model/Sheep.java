package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{

    @Override
    public String toString() {
        return "Sheep{" + super.toString() + ", lastSheering=" + lastSheering + '}';
    }

    private Date lastSheering;

    public Sheep(int id, String breed, Date bornOn, Date lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }
    
    public void sheer(){
        //TODO program function sheer
        System.out.println("sheep is sheering");
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
        //TODO program feed sheep
        return true;
    }

    @Override
    public int produce() {
        //TODO program produce sheeps
        return 0;
    }
    
}
