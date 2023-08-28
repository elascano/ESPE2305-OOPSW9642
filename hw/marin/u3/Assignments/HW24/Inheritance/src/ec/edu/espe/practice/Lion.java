
package ec.edu.espe.practice;

/**
 *
 * @author Josue Marin
 */
abstract class Mammal{
    public abstract void feed();
    
}
public class Lion extends Mammal {
    public void feed(){
        System.out.println("the lion is feeding :D");
    }
}
