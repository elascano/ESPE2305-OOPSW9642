
package com.codewarriors.seriesmath;

import com.codewarriors.seriesmath.Divergence;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Moran
 */
public class DivergenceTest {
    
    public DivergenceTest() {
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
     * Test of serie method, of class Divergence.
     */
    @Test
    public void testSerie() {
        System.out.println("serie");
        int number = 8;
        Divergence.serie(number);
    }

    /**
     * Test of calculateDivergence method, of class Divergence.
     */
    @Test
    public void testCalculateDivergence() {
        System.out.println("calculateDivergence");
        int number = 2;
        int expResult = -2;
        int result = Divergence.calculateDivergence(number);
        assertEquals(expResult, result);

    }

    /**
     * Test of numberSerie method, of class Divergence.
     */
    @Test
    public void testNumberSerie() {
        System.out.println("numberSerie");
        int number = 2;
        int expResult = 3;
        int result = Divergence.numberSerie(number);
        assertEquals(expResult, result);

    }
    
}
