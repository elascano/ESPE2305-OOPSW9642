
package jsons.series.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class SeriesTest {
    
    public SeriesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateDivergence method, of class Series.
     */
    @Test
    public void testCalculateDivergence() {
        System.out.println("calculateDivergence");
        int num, expResult, result;
        
        num= 1;
        expResult = 1;
        result = Series.calculateDivergence(num);
        assertEquals(expResult, result);
        
        num= 2;
        expResult = -1;
        result = Series.calculateDivergence(num);
        assertEquals(expResult, result);
        
        num= 3;
        expResult = 2;
        result = Series.calculateDivergence(num);
        assertEquals(expResult, result);
        
        num= 4;
        expResult = -2;
        result = Series.calculateDivergence(num);
        assertEquals(expResult, result);
        
        num= 5;
        expResult = 3;
        result = Series.calculateDivergence(num);
        assertEquals(expResult, result);
        
        
    }
    

    /**
     * Test of calculateFibonacci method, of class Series.
     */
    @Test
    public void testCalculateFibonacci() {
        System.out.println("calculateFibonacci");
        int num, expResult, result;
        num= 1;
        expResult = 1;
        result = Series.calculateFibonacci(num);
        assertEquals(expResult, result);
        
        num= 2;
        expResult = 1;
        result = Series.calculateFibonacci(num);
        assertEquals(expResult, result);
        
        num= 3;
        expResult = 2;
        result = Series.calculateFibonacci(num);
        assertEquals(expResult, result);
        
        num= 4;
        expResult = 3;
        result = Series.calculateFibonacci(num);
        assertEquals(expResult, result);
        
        num= 5;
        expResult = 5;
        result = Series.calculateFibonacci(num);
        assertEquals(expResult, result);
        
    }
    
}
