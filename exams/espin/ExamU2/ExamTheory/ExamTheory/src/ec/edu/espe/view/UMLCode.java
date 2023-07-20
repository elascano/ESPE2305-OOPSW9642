
package ec.edu.espe.view;

import ec.edu.espe.model.G;
import ec.edu.espe.model.H;
import ec.edu.espe.model.F;
import ec.edu.espe.model.J;
import ec.edu.espe.model.D;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.A;
import ec.edu.espe.model.E;
import java.util.ArrayList;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class UMLCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a;    
        B b;    
        C c;    
        D d;   
        ArrayList<A> as = new ArrayList<>();   
        ArrayList<B> bs = new ArrayList<>();    
        C[] cs = new C[3];    
        D[] ds = new D[4];    
        
        
        ArrayList<E> ees = new ArrayList<>();   
        ArrayList<F> fs = new ArrayList<>();    
        ArrayList<G> gs = new ArrayList<>();    
        G g = new G();    
        J j = new J();    
        E[] es = new E[5];    
        H h = new G();    

        a = new A(as);    
        b = new B(gs, as);    
        c = new C(ees, as);    
        d = new D(es, fs, as);    
        
        bs.add(b);    
        bs.add(b);    

        for(int i = 0 ; i < cs.length ; i++){    
            cs[i] = c;
        }
        
        for(int i = 0 ; i < ds.length ; i++){   
            ds[i] = d;
        }
        
        
        System.out.println("aqui bs -> " + bs);    
        System.out.println("aqui cs ->");    
        for(int i = 0 ; i < cs.length ; i++){
            System.out.println("aqui cs[" + i + "] -> " + cs[i]);
        }
        
        System.out.println("aqui ds ->");   
        for(int i = 0 ; i < cs.length ; i++){
            System.out.println("aqui ds[" + i + "] -> " + ds[i]);
        }
        
     
        
    }
    
}
