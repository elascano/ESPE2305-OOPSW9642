package AddendSeries;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class FactorialCalculatorTest {
    
    public FactorialCalculatorTest() {
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
     * Test of factorialCalculator method, of class FactorialCalculator.
     */
    @Test
    public void testFactorialCalculator() {
        System.out.println("factorialCalculator");
        int factorialNumber = 3;
        int expResult = 6;
        int result = FactorialCalculator.factorialCalculator(factorialNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
