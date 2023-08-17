/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package softwarejunior.guaman.series;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import softwarejuniors.guaman.series.BasicOperation;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
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
        float adden1 = 1.0F;
        float adden2 = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.0F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0);

    }
    
}
