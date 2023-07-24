package ec.edu.espe.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
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
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int n = 2;
        int expResult = 2;
        int result = Fibonacci.fibonacci(n);
        assertEquals(expResult, result);
        
    }
    
}
