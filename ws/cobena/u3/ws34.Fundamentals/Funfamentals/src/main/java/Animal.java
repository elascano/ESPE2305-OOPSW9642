
import java.util.Date;



/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public abstract class Animal {
    Date bornOn;
    Claw[] claws;

    @Override
    public String toString() {
        return "Animal{" + "bornOn=" + bornOn + ", claw=" + claws + '}';
    }
    
    public Animal(Date bornOn, Claw[] claws) {
        this.bornOn = bornOn;
        this.claws = new Claw[20];
        this.claws = claws;
    }
    
    public int getAge() {
        return 0;
    }
    
    public abstract void feed();
    
    public abstract void born();
}
