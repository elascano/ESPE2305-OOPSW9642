
package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class FibonacciTest {
    
    public FibonacciTest() {
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
     * Test of generateFibonacciSequence method, of class Fibonacci.
     */
    @Test
    public void testGenerateFibonacciSequence() {
        System.out.println("generateFibonacciSequence");
        int n = 10;
        int[] expResult = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34}; 
        int[] result = Fibonacci.generateFibonacciSequence(n);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of calculateFibonacci method, of class Fibonacci.
     */
    @Test
    public void testCalculateFibonacci() {
        System.out.println("calculateFibonacci");
        int n = 10;
        int expResult = 34;
        int result = Fibonacci.calculateFibonacci(n);
        assertEquals(expResult, result);
     
    }
    
}
