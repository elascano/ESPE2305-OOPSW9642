
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Tiger extends Mammal{

    @Override
    public String toString() {
        return super.toString() + " Tiger{" + '}';
    }

    
    
    public Tiger(ArrayList<Tooth> teeth, Date bornOn, Claw[] claw) {
        super(teeth, bornOn, claw);
    }
    
    @Override
    public void feed() {
        
    }

    @Override
    public void born() {
        
    }
    
}
