package ec.edu.espe.chickenfarm.model;
import java.util.Date;
/**
 *
 * @author Moran David
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
        return "\nChicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isMolting=" + isMolting +
                ", bornOnDate=" + bornOnDate +
                '}';
    }
    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        this.age = computeAge(bornOnDate);
    }

    private int computeAge(Date bornOnDate) {
        Date now = new Date();
        int year = now.getYear() - bornOnDate.getYear();
        return year;
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

    public boolean isMolting() {
        return isMolting;
    }

    public void setMolting(boolean molting) {
        isMolting = molting;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
}