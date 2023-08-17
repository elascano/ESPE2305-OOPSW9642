
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Chicken extends FarmAnimal implements iBird{
    private boolean isMolting;
    private int laidEggs;

    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn, float weight) {
        super(id, breed, bornOn, weight);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    public Chicken() {
    }

    @Override
    public String toString() {
        return "Chicken || " + super.toString() +" isMolting: " + isMolting +
                " || laidEggs: " + laidEggs ;
    }
    
    @Override
    public boolean feed(Food food){
        gainWeight(food.getWeightInGrames());
        return true;
    }
    
    @Override
    public int produce(){
        layAnEgg();
        return laidEggs;
    }
    
    @Override
    public void gainWeight(float foodWeightInGrames) {
        float actualWeight = super.getWeight();
        float weightGainInKg = foodWeightInGrames/1600.0F ;
        
        setWeight(actualWeight+weightGainInKg);
    }
    
    @Override
    public void layAnEgg(){
        laidEggs = laidEggs + 1;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public int getLaidEggs() {
        return laidEggs;
    }

    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
    }
    
}
