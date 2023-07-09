package ec.edu.espe.shoes.model;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class NaturalPersonController {
    private int id;
    private String name;
    private float year;
    private float salary;
    private float incomeTax;
    private float totalSalary;
    

    public NaturalPersonController(int id, String name, float year, float salary, float incomeTax, float totalSalary) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.incomeTax = incomeTax;
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "NaturalPersonController{" + "id=" + id + ", name=" + name + ", year=" + year + ", salary=" + salary + ", incomeTax=" + incomeTax + ", totalSalary=" + totalSalary + '}';
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
     * @return the year
     */
    public float getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(float year) {
        this.year = year;
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
     * @return the incomeTax
     */
    public float getIncomeTax() {
        return incomeTax;
    }

    /**
     * @param incomeTax the salary to set
     */
    public void setIncomeTax(float incomeTax) {
        this.incomeTax = incomeTax;
    }

    /**
     * @return the totalSalary
     */
    public float getTotalSalary() {
        return totalSalary;
    }

    /**
     * @param totalSalary the totalSalary to set
     */
    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }
    
}
