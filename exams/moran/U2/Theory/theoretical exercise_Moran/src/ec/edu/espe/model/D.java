
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Moran David
 */
public class D extends A{   
    private E[] es;         
    private ArrayList<F> fs;

    public D(E[] es, ArrayList<F> fs, ArrayList<A> as) { 
        super(as);
        es = new E[5];
        this.es = es;
        this.fs = fs;
    }
    
    
    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    
    
}
