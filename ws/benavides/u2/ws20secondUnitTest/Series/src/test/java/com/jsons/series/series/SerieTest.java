package com.jsons.series.series;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class SerieTest {
    
    public SerieTest() {
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
     * Test of computeDivergence method, of class Serie.
     */
    @Test
    public void testComputeDivergence() {
        System.out.println("computeDivergence - Test 1");
        int divergence = 1;
        int expResult = 1;
        int result = Serie.computeDivergence(divergence);
        assertEquals(expResult, result);
        
        System.out.println("computeDivergence - Test 2");
        divergence = 2;
        expResult = -1;
        result = Serie.computeDivergence(divergence);
        assertEquals(expResult, result);
        
        System.out.println("computeDivergence - Test 3");
        divergence = 3;
        expResult = 2;
        result = Serie.computeDivergence(divergence);
        assertEquals(expResult, result);
        
        System.out.println("computeDivergence - Test 4");
        divergence = 4;
        expResult = -2;
        result = Serie.computeDivergence(divergence);
        assertEquals(expResult, result);
    }
    
}
