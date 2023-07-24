
package jsons.series.calculator;
/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Series {
    public static int calculateDivergence(int num){
        int operator;
        int add=0;
        for(int i=1;i<=num;i++){
            if((i%2)==0)
            operator=i*(-1);
            else
            operator=i;
            
            add+=operator;
        }
        return add;
    }
    public static int calculateFibonacci(int num){        
        int cont = 0;
        int n2 = 0;
        int n1 = 1;

        for (cont = 0; cont < num; cont++){
            n2 = n2 + n1;
            n1 = n2 - n1;
        }
        return n2;
    }
}
