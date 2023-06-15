package ec.edu.espe.chickenfram.model;

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
    private boolean isMolting;
    private Date born0nDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", born0nDate=" + born0nDate + '}';
    }
    
    
    
    public void doStuff(int forTime){
        eat();
        poop();
        layAnEgg();
        }
    private void cluck(){
        System.out.println("chicken is clucking...");
    }       
    private void wander(){
        System.out.println("chicken is wandering...");
    }  
    private void eat(){
        System.out.println("chicken is eating...");
    }  
    private void drinck(){
        System.out.println("chicken is drinking...");
    }  
    private Poop poop(){
        System.out.println("chicken is pooping...");
        return new Poop();
    }  
       private Egg layAnEgg(){
        System.out.println("chicken is laying an egg..");
        return new Egg();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public Date getBorn0nDate() {
        return born0nDate;
    }

    public void setBorn0nDate(Date born0nDate) {
        this.born0nDate = born0nDate;
    }
    
}
