package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Pig extends FarmAnimal {
    float initialWeight;

    public Pig(float initialWeight, int id, String breed, Date bornOn, float weight) {
        super(id, breed, bornOn, weight);
        this.initialWeight = initialWeight;
    }
    
    public Pig() {
    }
    
    @Override
    public String toString() {
        return "Pig || " + super.toString();
    }
    
    @Override
    public boolean feed(Food food){
        gainWeight(food.getWeightInGrames());
        return true;
    }
    
    @Override
    public int produce(){
        float actualWeight = super.getWeight();
        float weightGained = actualWeight - initialWeight;
        return (int) weightGained;
    }
    
    @Override
    public void gainWeight(float foodWeightInGrames) {
        float actualWeight = super.getWeight();
        float weightGainInKg = foodWeightInGrames/1600.0F ;
        
        setWeight(actualWeight+weightGainInKg);
    }

    public float getInitialWeight() {
        return initialWeight;
    }

    public void setInitialWeight(float initialWeight) {
        this.initialWeight = initialWeight;
    }
    
    
}
