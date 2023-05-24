package ec.edu.espe.workphysics.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class WorkPhysicsFormula {
    private double appliedForce;
    private double displacement;
    private double work;

    @Override
    public String toString() {
        return (appliedForce + "," + displacement + "," + work);
    }
    
    public void calculateWork(){
        work = appliedForce * displacement;
    }
    
    public double getAppliedForce() {
        return appliedForce;
    }

    public void setAppliedForce(double appliedForce) {
        this.appliedForce = appliedForce;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public double getWork() {
        return work;
    }

    public void setWork(double work) {
        this.work = work;
    } 
}
