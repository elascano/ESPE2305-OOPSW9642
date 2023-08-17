
package AddenSeries;

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
public class BasicOperationTest {
    
    public BasicOperationTest() {
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
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float adden1 = 2.3F;
        float adden2 = 1.2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.5F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 4.2F;
        float subtrahend = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.8F;
        float result = instance.subtruct(minuend, subtrahend);
        assertEquals(expResult, result, 0);

    }
    
}
