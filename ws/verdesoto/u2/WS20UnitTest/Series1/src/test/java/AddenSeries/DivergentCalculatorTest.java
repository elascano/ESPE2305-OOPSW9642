/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
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
        int divergentNumber = 10;
        int expResult = -5;
        int result = DivergentCalculator.divergentCalculator(divergentNumber);
        assertEquals(expResult, result);

    }
    
}
