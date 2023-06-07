
package ec.edu.espe.chickenFarm.model;

import java.util.Calendar;
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
    private Date bornOnDate;

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        //TODO CODE, Call method that computes the age
        this.age = computeAge();
    }
    public int computeAge() {
    Calendar now = Calendar.getInstance();
    Calendar bornOn = Calendar.getInstance();
    bornOn.setTime(bornOnDate);
    int age = now.get(Calendar.YEAR) - bornOn.get(Calendar.YEAR);
    if (now.get(Calendar.DAY_OF_YEAR) < bornOn.get(Calendar.DAY_OF_YEAR)) {
        age--;
    }  return age;
        }
    
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + 
                ", age=" + age + ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
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
