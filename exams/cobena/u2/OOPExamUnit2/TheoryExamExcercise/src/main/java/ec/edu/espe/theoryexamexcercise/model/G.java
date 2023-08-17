
package ec.edu.espe.theoryexamexcercise.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class G implements H{
    J j;

    public G(J j) {
        this.j = j;
    }
    
    public void m(J j){
        System.out.println("Im G, using J");
    }

    @Override
    public String toString() {
        return "G" + "associated by" + j;
    }

    
    
    @Override
    public void toImplement() {
        System.out.println("Im G, that implements H");
    }
}
