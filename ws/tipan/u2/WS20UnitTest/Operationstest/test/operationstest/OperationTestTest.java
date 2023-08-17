
package operationstest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import utils.Fibonacci;
import utils.DivergenceSeries;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */



public class OperationTestTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testGenerateFibonacciSequence() {
        int n = 10;
        int[] expectedSequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        
        int[] actualSequence = Fibonacci.generateFibonacciSequence(n);
        
        assertArrayEquals(expectedSequence, actualSequence, "Fibonacci sequence doesn't match.");
    }

    @Test
    public void testCalculateFibonacci() {
        int[] expectedValues = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        
        for (int i = 0; i < expectedValues.length; i++) {
            int actualValue = Fibonacci.calculateFibonacci(i);
            assertEquals(expectedValues[i], actualValue, "Fibonacci value for index " + i + " doesn't match.");
        }
    }
    
    @Test
    public void testGenerateDivergenceSeries() {
        int n = 10;
        String expectedSeries = "\n\nDivergence series: 1 -2 3 -4 5 -6 7 -8 9 -10";
        
        String actualSeries = DivergenceSeries.generateSeries(n);
        
        assertEquals(expectedSeries, actualSeries, "Divergence series doesn't match.");
    }

    /**
     * Test of main method, of class OperationTest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        OperationTest.main(args);
       
    }
}
