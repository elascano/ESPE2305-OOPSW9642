package ec.edu.espe.chickenfarmsimulator.model;

import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date date;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", date=" + date + '}';
    }
    
    public void doStuff (int forTime){
        eat();
        poop();
        layAnEgg();
    }
    
    private void cluck (){
        System.out.println("chicken is clucking ...");
    }
    
    private void wander(){
        System.out.println("chicken is wandering");
    }
    
    private void eat(){
        System.out.println("chicken is eating");
    }
    
    private void drink(){
        System.out.println("chicken is drinking");
    }
    
    private Poop poop(){
        System.out.println("chicken is pooping");
        return new Poop();
    }
    
    private Egg layAnEgg(){
        System.out.println("chicken is laying an egg ...");
        return new Egg();
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
}
