package ec.edu.espe.formula.model;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class ohmVariables {
    

    public int current;
    private int resistence;
    private int voltage;
    private String datos;

    @Override
    public String toString() {
        return "ohmVariables{" + "current=" + getCurrent() + ", resistence=" + getResistence() + ", voltage=" + getVoltage() + '}';
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getResistence() {
        return resistence;
    }

    public void setResistence(int resistence) {
        this.resistence = resistence;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public char[] setDatos(ohmVariables datos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
