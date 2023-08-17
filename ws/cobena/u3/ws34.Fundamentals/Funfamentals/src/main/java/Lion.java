
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Lion extends Mammal {

    @Override
    public String toString() {
        return super.toString() + " Lion{" + '}';
    }
 
    public Lion(ArrayList<Tooth> teeth, Date bornOn, Claw[] claw) {
        super(teeth, bornOn, claw);
    }

    @Override
    public void feed() {
    
    }

    @Override
    public void born() {
    
    }
    
}
