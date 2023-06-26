
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jeffrey Manobanda, Code Crafters
 */
public class Cow extends FarmAnimal {
    private boolean produceMilk;

    @Override
    public String toString() {
        return "Cow{" + super.toString() + "produceMilk=" + produceMilk + '}';
    }

    public int getProduceMilk() {
      
        return 0;  
    }

    public void setProduceMilk(boolean produceMilk) {
        this.produceMilk = produceMilk;
    }



    public Cow(boolean produceMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.produceMilk = produceMilk;
    }

    @Override
    public boolean feed(Food food) {
       return true; 
    }

    @Override
    public int produce() {
        return 50;
    }
    
    public int produce(Meat meat){
    return meat.getPounds();
    }
   
}