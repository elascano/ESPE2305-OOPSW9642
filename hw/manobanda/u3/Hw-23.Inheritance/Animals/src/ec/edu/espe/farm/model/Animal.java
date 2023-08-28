
package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jnman
 */
    public abstract class Animal{
    private Date bornOn;
    private Claw claw[];
    public Date getAge () {
        return new Date ();
    }
    public abstract void Bird();
    
    public Date getBornOn () {
        return bornOn;
    }
    
    public void setBornOn (Date bornOn){
        this.bornOn = bornOn;
        }
    
    public void feed(){
    
    }
    public void born(){
   
    }
}

