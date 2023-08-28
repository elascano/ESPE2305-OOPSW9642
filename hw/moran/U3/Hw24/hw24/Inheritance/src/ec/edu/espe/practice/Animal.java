
package ec.edu.espe.practice;

import java.util.Date;

/**
 *
 * @author Moran David
 */
public abstract class Animal {
    
    private Date BornOnDate;
    Claw[]Array = new Claw[20];
    
    public void getAge(){
        //TODO...
    }
    
    public abstract void feed();
    public abstract void born();
    
}
