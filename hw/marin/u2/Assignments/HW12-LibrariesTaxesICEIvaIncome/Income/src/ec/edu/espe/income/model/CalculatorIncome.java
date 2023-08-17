
package ec.edu.espe.income.model;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class CalculatorIncome {
    private int id;
    private float totalPrice;
    private float ingresoAnual;

    public CalculatorIncome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
public String toString() {
    return "Income [id=" + id + ", price="  + totalPrice + ", annualIncome=" + ingresoAnual + "]";
}

    
    public CalculatorIncome(float totalPrice, float ingresoAnual) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.ingresoAnual = ingresoAnual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(float ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }
    
}
