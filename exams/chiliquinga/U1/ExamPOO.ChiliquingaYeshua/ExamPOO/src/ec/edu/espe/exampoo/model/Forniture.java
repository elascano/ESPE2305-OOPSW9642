package ec.edu.espe.exampoo.model;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Forniture {
    private String food;
    private String medicine;
    private String tool;

    public Forniture(String food, String medicine, String tool) {
        this.food = food;
        this.medicine = medicine;
        this.tool = tool;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
    
}
