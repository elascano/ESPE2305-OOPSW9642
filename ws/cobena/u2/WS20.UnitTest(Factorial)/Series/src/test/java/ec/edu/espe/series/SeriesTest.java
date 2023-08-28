
package ec.edu.espe.series;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
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
     * Test of computeFactorial method, of class Series.
     */
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int factorialNumber = 6;
        int expResult = 720;
        int result = Series.computeFactorial(factorialNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of computeDivergence method, of class Series.
     */
    @Test
    public void testComputeDivergence() {
        System.out.println("computeDivergence");
        System.out.println("Test 1");
        int quantityOfNumbers = 1;
        int expResult = 1;
        int result = Series.computeDivergence(quantityOfNumbers);
        assertEquals(expResult, result);
        
        System.out.println("Test 2");
        quantityOfNumbers = 2;
        expResult = -1;
        result = Series.computeDivergence(quantityOfNumbers);
        assertEquals(expResult, result);
        
        System.out.println("Test 3");
        quantityOfNumbers = 3;
        expResult = 2;
        result = Series.computeDivergence(quantityOfNumbers);
        assertEquals(expResult, result);
        
        System.out.println("Test 4");
        quantityOfNumbers = 4;
        expResult = -2;
        result = Series.computeDivergence(quantityOfNumbers);
        assertEquals(expResult, result);
        
        System.out.println("Test 5");
        quantityOfNumbers = 5;
        expResult = 3;
        result = Series.computeDivergence(quantityOfNumbers);
        assertEquals(expResult, result);

        System.out.println("Test 6");
        quantityOfNumbers = 6;
        expResult = -3;
        result = Series.computeDivergence(quantityOfNumbers);
        assertEquals(expResult, result);
    }

 
    
}
