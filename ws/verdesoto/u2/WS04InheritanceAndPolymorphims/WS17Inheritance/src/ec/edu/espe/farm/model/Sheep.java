package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {
    Date lastSheering;

    public Sheep(Date lastSheering, int id, String bredd, Date bornOn) {
        super(id, bredd, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLast Sheering=" + lastSheering ;
    }
    
    public int undergrowthControl(){
        int metersEat;
        metersEat = 20;
        return metersEat;
    }
    @Override
    public int produce() {
        return 30;
    }
    
    public int produce (Meat meat){
        return meat.getPounds();
    }
    
    @Override
    public boolean feed(Food food) {
        return true;
    }
    
    
}
