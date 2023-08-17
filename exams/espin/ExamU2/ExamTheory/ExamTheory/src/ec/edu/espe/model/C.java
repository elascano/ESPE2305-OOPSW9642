package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class C extends A{       
    private ArrayList<E> es;    

    public C(ArrayList<E> es, ArrayList<A> as) {    
        super(as);
        this.es = es;
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }
    
    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
}
