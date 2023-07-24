
package ec.edu.espe.q38.model;

import java.util.ArrayList;
/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
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
