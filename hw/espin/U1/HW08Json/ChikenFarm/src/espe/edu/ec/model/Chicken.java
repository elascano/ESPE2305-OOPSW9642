
package espe.edu.ec.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Andres Espin,killChain,DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private boolean isMolting;
    private Date bornOnDate;
    private int age;

    public Chicken(int id, String name, String color, boolean isMolting, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
    
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Los meses se cuentan desde 0 en Java, por eso restamos 1.
        this.bornOnDate = calendar.getTime();
    
        this.age = computeAge(this.bornOnDate);
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + ", age=" + age + '}';
    }
    
    public int computeAge(Date bornOnDate){
        Calendar birthDate = Calendar.getInstance();
        Calendar nowDate = Calendar.getInstance();

        birthDate.setTime(bornOnDate);
        nowDate.setTime(new Date());
        
        int years = nowDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (nowDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) ||
        (nowDate.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) && nowDate.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            years--;
        }
        
        return years;
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
