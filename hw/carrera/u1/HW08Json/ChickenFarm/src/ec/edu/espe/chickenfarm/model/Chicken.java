package ec.edu.espe.chickenfarm.model;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "\n Chicken{" + "id=" + id + ", name=" + name + 
        ", color=" + color + ", age=" + age + 
        ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
    }     

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        //TOCO call method computes the age
        this.age = computeAge(bornOnDate);
        //these methods are deprecated
    }
    /*public Date computeAge(Date bornOnDate){
        //TODO code, compute age in years using bornOnDate
        
        return new Date();
    }*/
    
    private int computeAge(Date bornOnDate1){
        Random random = new Random();
        int actualYear= new Date().getYear();
        int year = actualYear-bornOnDate.getYear();
        return (year);
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
}
