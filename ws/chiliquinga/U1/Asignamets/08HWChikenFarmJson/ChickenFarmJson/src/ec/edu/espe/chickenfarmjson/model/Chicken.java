package ec.edu.espe.chickenfarmjson.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    Date bornOnDate;

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.age = computeAge(bornOnDate);
        
    }
    
    public int computeAge(Date bornOnDate){
        //TODO code, compute age in years using the bornOnDate
        Calendar now = Calendar.getInstance();
        Calendar bornOn = Calendar.getInstance();
        bornOn.setTime(bornOnDate);
        int age = now.get(Calendar.YEAR) - bornOn.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < bornOn.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }  
        return age;
    }
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name +
                ", color=" + color + ", age=" + age + ", isMolting=" + 
                isMolting + ", bornOnDate=" + bornOnDate + '}';
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

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

}
