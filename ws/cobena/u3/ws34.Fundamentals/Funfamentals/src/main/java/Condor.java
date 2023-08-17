
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
public class Condor extends Bird{

    @Override
    public String toString() {
        return super.toString() + "Condor{" + '}';
    }
    
    public Condor(ArrayList<Feather> feathers, Beak beak, Date bornOn, Claw[] claws) {
        super(feathers, beak, bornOn, claws);
    }

    @Override
    public void feed() {
        
    }

    @Override
    public void born() {
        
    }
    
}
