package ec.edu.espe.videogames.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Owner {
    private int id;
    private String name;
    private double salary;
    private double taxesToPay;
    private double salaryAfterTaxes;

    public Owner(int id, String name, double salary, double taxesToPay, double salaryAfterTaxes) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.taxesToPay = taxesToPay;
        this.salaryAfterTaxes = salaryAfterTaxes;
    }

    @Override
    public String toString() {
        return "Owner{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", taxesToPay=" + taxesToPay + 
                ", salaryAfterTaxes=" + salaryAfterTaxes + '}';
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
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the taxesToPay
     */
    public double getTaxesToPay() {
        return taxesToPay;
    }

    /**
     * @param taxesToPay the taxesToPay to set
     */
    public void setTaxesToPay(double taxesToPay) {
        this.taxesToPay = taxesToPay;
    }

    /**
     * @return the salaryAfterTaxes
     */
    public double getSalaryAfterTaxes() {
        return salaryAfterTaxes;
    }

    /**
     * @param salaryAfterTaxes the salaryAfterTaxes to set
     */
    public void setSalaryAfterTaxes(double salaryAfterTaxes) {
        this.salaryAfterTaxes = salaryAfterTaxes;
    }

    
}
