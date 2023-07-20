
package ec.edu.espe.model;

import java.util.ArrayList;
/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class B extends A{      
    private ArrayList<G> gs;    

    public B(ArrayList<G> gs, ArrayList<A> as) {    
        super(as);
        this.gs = gs;
    }
    
    public void r(){
        gs = new ArrayList<G>();
    }
    
    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }
    
}
