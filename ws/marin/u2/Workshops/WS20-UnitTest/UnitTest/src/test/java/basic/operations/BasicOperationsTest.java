package basic.operations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class BasicOperations.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BasicOperations.main(args);
        
    }

    /**
     * Test of calculateFibonacci method, of class BasicOperations.
     */
    @Test
    public void testCalculateFibonacci() {
        System.out.println("calculateFibonacci");
        int number = 10;
        int expResult = 34;
        int result = BasicOperations.calculateFibonacci(number);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of evaluateNumber method, of class BasicOperations.
     */
    @Test
    public void testEvaluateNumber() {
        System.out.println("evaluateNumber");
        int numberdi = 0;
        BasicOperations.evaluateNumber(numberdi);
       
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 2.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 5.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
      
    }

    /**
     * Test of subtruct method, of class BasicOperations.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuhed = 0.0F;
        float substrahed = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.subtruct(minuhed, substrahed);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
