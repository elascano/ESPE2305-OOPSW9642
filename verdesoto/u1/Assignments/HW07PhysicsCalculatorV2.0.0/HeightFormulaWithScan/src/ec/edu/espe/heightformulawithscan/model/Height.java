package ec.edu.espe.heightformulawithscan.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Height {
    private double initialVelocity;
    private double finalVelocity;
    private double time;
    private double height;
        
    public Height (double initialVelocity, double finalVelocity, double time){
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.time = time;
    }
    
    public double calculateHeigth(){
        return (((getInitialVelocity() + getFinalVelocity()) / 2) * getTime());
    }

    /**
     * @return the initialVelocity
     */
    public double getInitialVelocity() {
        return initialVelocity;
    }

    /**
     * @param initialVelocity the initialVelocity to set
     */
    public void setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    /**
     * @return the finalVelocity
     */
    public double getFinalVelocity() {
        return finalVelocity;
    }

    /**
     * @param finalVelocity the finalVelocity to set
     */
    public void setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) {
        this.time = time;
    }    

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
       
    
}
