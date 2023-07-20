
package ec.espe.edu.fibonacci;
    

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class DivergentCalculator {

    public static int divergence(int divergenceNumber){
        int result = 0;
        int firstnumber = 1;
        
        if(divergenceNumber >= 2){
            for(int i=1; i<divergenceNumber; i++){
            firstnumber += -i;
            result += firstnumber;
            } 
        }else{
            result = divergenceNumber;
        }
        return result;   
    }
}
