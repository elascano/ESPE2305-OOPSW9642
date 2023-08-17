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
public class DivergentCalculatorTest {
    
    public DivergentCalculatorTest() {
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
     * Test of divergentCalculator method, of class DivergentCalculator.
     */
    @Test
    public void testDivergentCalculator() {
        System.out.println("divergentCalculator");
        int divergentNumber = 4;
        int expResult = -2;
        int result = DivergentCalculator.divergentCalculator(divergentNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
