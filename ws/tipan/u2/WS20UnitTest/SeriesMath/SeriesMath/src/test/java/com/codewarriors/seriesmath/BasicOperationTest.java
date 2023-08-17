
package com.codewarriors.seriesmath;

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
        float adden1 = 8.0F;
        float adden2 = 10.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 18.0F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 7.0F;
        float subtrahend = 5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.0F;
        float result = instance.subtruct(minuend, subtrahend);
        assertEquals(expResult, result, 0);
       
    }
    
}
