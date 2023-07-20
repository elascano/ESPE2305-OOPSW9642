
package ec.edu.espe.fram.model;

import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    private Date lastSheerin;
    private int kgOfWool;

    public Sheep(Date lastSheerin, int kgOfWool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheerin = lastSheerin;
        this.kgOfWool = kgOfWool;
    }

    @Override
    public String toString() {
        return "Sheep{" + super.toString() + "lastSheerin=" + lastSheerin + ", kgOfWool=" + kgOfWool + '}';
    }
    
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 2;
    }   
    
    /**
     * @return the lastSheerin
     */
    public Date getLastSheerin() {
        return lastSheerin;
    }

    /**
     * @param lastSheerin the lastSheerin to set
     */
    public void setLastSheerin(Date lastSheerin) {
        this.lastSheerin = lastSheerin;
    }

    /**
     * @return the kgOfWool
     */
    public int getKgOfWool() {
        return kgOfWool;
    }

    /**
     * @param kgOfWool the kgOfWool to set
     */
    public void setKgOfWool(int kgOfWool) {
        this.kgOfWool = kgOfWool;
    }

     public void toGetWool() {
        kgOfWool = kgOfWool +1;
    }
}
    

    
    

