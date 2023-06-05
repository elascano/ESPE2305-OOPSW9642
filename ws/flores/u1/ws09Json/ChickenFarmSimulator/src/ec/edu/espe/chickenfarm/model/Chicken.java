package ec.edu.espe.chickenfarm.model;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Caetano Flores, Software Juniors, DCCO-ESPE
 */
public class Chicken {
        private int id;
        private int age;
        private String name;
        private String color;
        private boolean isMolting;
        private Date bornOnDate;

    public Chicken(int id, String name, String color, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = computeAge();
        this.age = 0;
        this.age = computeAge().getYear();
    }
    
    private Date computeAge(){
        Random random = new Random();
        int year = random.nextInt(70)+1;
        int month = random.nextInt(12)+1;
        int date = random.nextInt(30)+1;
        return (new Date(year, month, date));
    }
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + 
                ", age=" + age + ", isMolting=" + isMolting +
                ", bornOnDate=" + bornOnDate + "}\n";
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

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

}
