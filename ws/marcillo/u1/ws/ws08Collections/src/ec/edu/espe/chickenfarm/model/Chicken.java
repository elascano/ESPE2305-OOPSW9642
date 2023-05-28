
package ec.edu.espe.chickenfarm.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age; 
    private boolean isMolting;
    private Date bornOnDate;
    private long diffInMillins; 
    private long diffInSeconds;
    private long diffInMinutes;
    private long diffInHours;
    private long diffInDays;
    private int diffInYears;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + 
                ", age=" + getAge() + ", isMolting=" + isIsMolting() + ", bornOnDate=" + 
                getBornOnDate() + '}';
    }

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
    this.id = id;
    this.name = name;
    this.color = color;
    this.isMolting = isMolting;
    this.bornOnDate = bornOnDate;
    this.age = computeAge();
    }


   public int computeAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate bornDate = bornOnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(bornDate, currentDate);
        
        int diffInYears = period.getYears();
        if (bornDate.plusYears(diffInYears).isAfter(currentDate)) {
            int diffInYears1 = diffInYears;
        }
        
        return diffInYears;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return the diffInMillins
     */
    public long getDiffInMillins() {
        return diffInMillins;
    }

    /**
     * @param diffInMillins the diffInMillins to set
     */
    public void setDiffInMillins(long diffInMillins) {
        this.diffInMillins = diffInMillins;
    }

    /**
     * @return the diffInSeconds
     */
    public long getDiffInSeconds() {
        return diffInSeconds;
    }

    /**
     * @param diffInSeconds the diffInSeconds to set
     */
    public void setDiffInSeconds(long diffInSeconds) {
        this.diffInSeconds = diffInSeconds;
    }

    /**
     * @return the diffInMinutes
     */
    public long getDiffInMinutes() {
        return diffInMinutes;
    }

    /**
     * @param diffInMinutes the diffInMinutes to set
     */
    public void setDiffInMinutes(long diffInMinutes) {
        this.diffInMinutes = diffInMinutes;
    }

    /**
     * @return the diffInHours
     */
    public long getDiffInHours() {
        return diffInHours;
    }

    /**
     * @param diffInHours the diffInHours to set
     */
    public void setDiffInHours(long diffInHours) {
        this.diffInHours = diffInHours;
    }

    /**
     * @return the diffInDays
     */
    public long getDiffInDays() {
        return diffInDays;
    }

    /**
     * @param diffInDays the diffInDays to set
     */
    public void setDiffInDays(long diffInDays) {
        this.diffInDays = diffInDays;
    }

    /**
     * @return the diffInYears
     */
    public int getDiffInYears() {
        return diffInYears;
    }

    /**
     * @param diffInYears the diffInYears to set
     */
    public void setDiffInYears(int diffInYears) {
        this.diffInYears = diffInYears;
    }
}
