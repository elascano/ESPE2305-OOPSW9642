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

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class SeriesCalculatorTest {
    
    public SeriesCalculatorTest() {
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
     * Test of divergenceCalculator method, of class SeriesCalculator.
     */
    @Test
    public void testDivergenceCalculator() {
        System.out.println("divergenceCalculator");
        int divergentNum = 1;
        int expResult = 1;
        int result = SeriesCalculator.divergenceCalculator(divergentNum);
        assertEquals(expResult, result);

    }
    
}
