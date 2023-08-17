package ec.edu.espe.farm.model;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String breed, Date bornOn, float weight) {
        super(id, breed, bornOn, weight);
        this.isProducingMilk = isProducingMilk;
    }
    
    public Cow() {
    }

    @Override
    public boolean feed(Food food){
        gainWeight(food.getWeightInGrames());
        return true;
    }
    
    @Override
    public int produce(){   
        int BreedLowestMilkProduce = 5;
        int BreedHighestMilkProduce = 8;
        Random randomMilkLiters = new Random();
        
        return randomMilkLiters.nextInt(BreedLowestMilkProduce,BreedHighestMilkProduce);
    }
    
    @Override
    public void gainWeight(float foodWeightInGrames) {
        float actualWeight = super.getWeight();
        float weightGainInKg = foodWeightInGrames/1600.0F ;
        
        setWeight(actualWeight+weightGainInKg);
    }

    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
}
