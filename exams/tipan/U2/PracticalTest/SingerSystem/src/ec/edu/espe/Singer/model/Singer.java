
package ec.edu.espe.Singer.model;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class Singer {

    private String name;
    private float salary;
    private String date;
    private int age;
    private float year;

    public Singer(String name, float year, String date, int age, float salary) {
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.age = age;
        this.year= year;
    }

    public Singer() {
    }
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", salary=" + salary + ", date=" + date + ", age=" + age +",totalyear"+year+ '}';
    }

    public String toStringData() {
        return name + "," + salary + "," + date + "," + age+","+ year;
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
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
     * @return the salary
     */
    public float getYear() {
        return salary;
    }

    /**
     * @param year the year to set
     */
    public void setYear(float year) {
        this.year = year;
    }
}