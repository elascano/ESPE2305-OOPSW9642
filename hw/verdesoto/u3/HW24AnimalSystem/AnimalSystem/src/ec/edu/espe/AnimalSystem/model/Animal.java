package ec.edu.espe.AnimalSystem.model;

import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public abstract class Animal {
    private Date bornOnDate;   
    Claw[] claw = new Claw[20];

    public Animal(Date bornOnDate, Claw[] claw) {
        this.bornOnDate = bornOnDate;
        this.claw = claw;
    }
    
    public int getAge() {
         return 0;}
    
    public abstract boolean feed();
    public abstract void born();
}
