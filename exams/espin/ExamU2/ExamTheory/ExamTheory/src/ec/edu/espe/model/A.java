package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class A {                
    private ArrayList<A> as;    

    public A(ArrayList<A> as) {
        this.as = as;
    }

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
   
    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
    

}
