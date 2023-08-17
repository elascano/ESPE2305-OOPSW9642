package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Moran DavidE
 */
public abstract class FarmAnimal {
    private int id;
    private String bredd;
    private Date bornOn;
    
    public abstract int produce();    
    public abstract boolean feed(Food food);
    
    public int getAgeInMonths(){
        //TODO compute age
        return 0;
    }
    
    public FarmAnimal(int id, String bredd, Date bornOn) {
        this.id = id;
        this.bredd = bredd;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "id=" + id + " bredd=" + bredd + "  bornOn=" + bornOn + '}';
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the bredd
     */
    public String getBredd() {
        return bredd;
    }

    /**
     * @param bredd the bredd to set
     */
    public void setBredd(String bredd) {
        this.bredd = bredd;
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }  

}
