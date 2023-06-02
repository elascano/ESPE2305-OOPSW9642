package ec.edu.espe.chickenfarm.model;

import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int ageInYears;
    private int ageInDays;
    private int ageInMonths;
    private boolean isMolting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken" + "id=" + getId() + ", name=" + getName() +
                ", color=" + getColor() + ", age=" + getAgeInYears() + "years, " + getAgeInMonths() + "months, "  + getAgeInDays() + 
                "days" + ", isMolting=" 
                + isIsMolting() + ", bornOnDate=" + getBornOnDate() + "\n";
    }

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        this.ageInYears = computeAge()/365;
        this.ageInDays = (computeAge()%365)/12;    
        this.ageInMonths = (computeAge()%365)/30;
    }
    
    public final int computeAge (){
        
        long diff = new Date().getTime() - getBornOnDate().getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long realAge = time.convert(diff, TimeUnit.MILLISECONDS);
        return (int) (realAge);
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ageInYears
     */
    public int getAgeInYears() {
        return ageInYears;
    }

    /**
     * @param ageInYears the ageInYears to set
     */
    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    /**
     * @return the ageInDays
     */
    public int getAgeInDays() {
        return ageInDays;
    }

    /**
     * @param ageInDays the ageInDays to set
     */
    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    /**
     * @return the ageInMonths
     */
    public int getAgeInMonths() {
        return ageInMonths;
    }

    /**
     * @param ageInMonths the ageInMonths to set
     */
    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    
    
}
