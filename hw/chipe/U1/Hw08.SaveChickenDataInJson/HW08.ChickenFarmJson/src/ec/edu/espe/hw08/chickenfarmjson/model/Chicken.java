
package ec.edu.espe.hw08.chickenfarmjson.model;

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
    private Date bornOnDate;
    
    @Override
    public String toString() {
        return "Chicken # " + id + "\n Name:" + name 
                + ", Color: " + color + ", Age: " + age 
                + ", isMolting: " + isMolting 
                + ", Born date: " + bornOnDate + "}\n";
    }

    public Chicken() {
    }
    
    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        bornOnDate.setYear(bornOnDate.getYear()-1900);
        this.bornOnDate = bornOnDate;
        this.age = computeAge().getYear();
    }
    
    private Date computeAge(){
        long timeDiff = new Date().getTime() - bornOnDate.getTime();
        Date ageDate = new Date();
        ageDate.setTime(timeDiff);
        ageDate.setYear(ageDate.getYear()-70);
        return ageDate;
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

    public void setAge() {
        this.age = computeAge().getYear();
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
        Date date = new Date();
        date.setYear(bornOnDate.getYear()-1900);
        date.setMonth(bornOnDate.getMonth()-1);
        date.setDate(bornOnDate.getDate());
        this.bornOnDate = date;
    }
}
