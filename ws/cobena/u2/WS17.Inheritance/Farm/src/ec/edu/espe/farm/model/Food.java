
package ec.edu.espe.farm.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Food {
    private float weightInGrames;

    public Food(float weightInGrames) {
        this.weightInGrames = weightInGrames;
    }

    public Food() {
    }
    
    
    
    public float getWeightInGrames() {
        return weightInGrames;
    }

    public void setWeightInGrames(float weightInGrames) {
        this.weightInGrames = weightInGrames;
    }
    
}
