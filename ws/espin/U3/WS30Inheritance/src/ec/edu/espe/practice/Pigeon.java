
package ec.edu.espe.practice;

/**
 *
 * @author Espin Andres, KillChain
 */

abstract class Bird{
    public abstract void feed();
}

public class Pigeon extends Bird {
    public void feed(){
        System.out.println("the pigeon is feedind :D");
    }     
}