package ec.edu.espe.ohmsLaw.model;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class ohmVariables {
    
    public int current;
    public int resistence;
    public int voltage;

    @Override
    public String toString() {
        return "ohmVariables{" + "current=" + current + ", resistence=" + resistence + ", voltage=" + voltage + '}';
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
    
    
}
