
package ec.espe.edu.model;

import java.util.Date;

/**
 *
 * @author USER
 */

public class Chicken {
    
    private int idd;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "idd=" + idd + ", name=" + name + ", color=" + color + ", egg=" + age + ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
    }
    
    
    public void doStuff(int forTime) {
        
        eat();
        poop();
        layAnEgg();
    }

    private void cluck() {
        System.out.println("chicken is clucking...");
    }

    private void wander() {
        System.out.println("chicken is eating...");
    }

    private void eat() {
        System.out.println("chicken is eating...");
    }

    private void drink() {
        System.out.println("chicken is drinking...");
    }

    private void poop() {
        System.out.println("chicken is pooping...");
    }

    private void age() {
        System.out.println("chicken is clucking...");
    }
    
    private void layAnEgg() {
        System.out.println("chicken is laying an egg...");
    }

    /**
     * @return the idd
     */
    public int getIdd() {
        return idd;
    }

    /**
     * @param idd the idd to set
     */
    public void setIdd(int idd) {
        this.idd = idd;
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
     * @return the egg
     */
    public int getEgg() {
        return age;
    }

    /**
     * @param egg the egg to set
     */
    public void setEgg(int egg) {
        this.age = egg;
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
}