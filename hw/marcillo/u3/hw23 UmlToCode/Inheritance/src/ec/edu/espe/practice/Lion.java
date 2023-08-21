
package ec.edu.espe.practice;

/**
 *
 * @author USER
 */
abstract class Mammal{
    public abstract void feed();
    
}
public class Lion extends Mammal {
    @Override
    public void feed(){
        System.out.println("the lion is feeding :D");
    }
}
