
package ec.edu.espe.practice;

import java.util.ArrayList;

/**
 *
 * @author Josue Marin
 */
public abstract class Mammal extends Animal{
    
    private ArrayList<Tooth> tooth;

    public Mammal(ArrayList<Tooth> tooth) {
        this.tooth = tooth;
    }

    public abstract void feed();
    
     
}
