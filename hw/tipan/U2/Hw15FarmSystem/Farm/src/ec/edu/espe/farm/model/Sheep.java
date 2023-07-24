
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {

    private Date lastSheering;

    public Sheep(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 15;
    }
    
    public Date getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    public boolean producesCompost() {
        
        return true; 
    }

    public void shear() {
        Date lastSheering = new Date();
        setLastSheering(lastSheering);

        System.out.println("Sheep sheared on: " + lastSheering);
    }
}
