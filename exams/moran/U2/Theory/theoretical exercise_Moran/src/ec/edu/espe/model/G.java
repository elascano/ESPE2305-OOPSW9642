
package ec.edu.espe.model;

/**
 *
 * @author Moran David
 */
public class G implements H{ 
    
    @Override             
    public J m() {
        return new J();
    }

    @Override
    public void m(J j) {    
        System.out.println("running method m(J j) with j -> " + j);
    }

    public G() {
    }

    
    
}
