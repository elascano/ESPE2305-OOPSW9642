package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {
    Date lastSheerDate;

    public Sheep(Date lastSheerDate, int id, String breed, Date bornOn, float weight) {
        super(id, breed, bornOn, weight);
        this.lastSheerDate = lastSheerDate;
    }
    
    public Sheep() {
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
        
        return 0;
    }
    
    @Override
    public void gainWeight(float foodWeightInGrames) {
        float actualWeight = super.getWeight();
        float weightGainInKg = foodWeightInGrames/1600.0F ;
        
        setWeight(actualWeight+weightGainInKg);
    }

    public Date getLastSheerDate() {
        return lastSheerDate;
    }

    public void setLastSheerDate(Date lastSheerDate) {
        this.lastSheerDate = lastSheerDate;
    }
    
    
}
