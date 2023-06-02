
package ec.edu.espe.chickenfarm.model;

import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMOlting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + 
                ", age=" + getAge() + ", isMOlting=" + isIsMOlting() + ", bornOnDate=" + getBornOnDate() + '}';
    }
    
    public Chicken(int id, String name, String color, boolean isMOlting, Date bornOndate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMOlting = isMOlting;
        this.bornOnDate = bornOndate;
        //TODO call method that computes the age
        this.age =  2023-(bornOnDate.getYear()+1900);
        //these methods are deprecated
             
    }
    private Date computeAge(Date bornOnDate){
        //TODO Code, compute age usign the broOnDate
        System.out.println(bornOnDate);
        return new Date();
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
     * @return the isMOlting
     */
    public boolean isIsMOlting() {
        return isMOlting;
    }

    /**
     * @param isMOlting the isMOlting to set
     */
    public void setIsMOlting(boolean isMOlting) {
        this.isMOlting = isMOlting;
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
