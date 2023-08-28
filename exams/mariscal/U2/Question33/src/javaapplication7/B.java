/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class B {
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
