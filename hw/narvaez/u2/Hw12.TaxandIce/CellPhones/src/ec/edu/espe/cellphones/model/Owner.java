package ec.edu.espe.cellphones.model;

/**
 *
 * @author Narvaez Leonardo,The FAMSE, DCCO-ESPE
 */
public class Owner {
    private int id;
    private String name;
    private float salary;
    private float taxesToPay;
    private float netSalary;

    @Override
    public String toString() {
        return "Owner" + "\nId=" + id + "\nName=" + name + "\nSalary=" + salary + "\nTaxesToPay=" + taxesToPay + "\nNet Salary=" + netSalary ;
    }

    public Owner(int id, String name, float salary, float taxesToPay, float netSalary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.taxesToPay = taxesToPay;
        this.netSalary = netSalary;
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
     * @return the taxesToPay
     */
    public float getTaxesToPay() {
        return taxesToPay;
    }

    /**
     * @param taxesToPay the taxesToPay to set
     */
    public void setTaxesToPay(float taxesToPay) {
        this.taxesToPay = taxesToPay;
    }

    /**
     * @return the netSalary
     */
    public float getNetSalary() {
        return netSalary;
    }

    /**
     * @param netSalary the netSalary to set
     */
    public void setNetSalary(float netSalary) {
        this.netSalary = netSalary;
    }
}
