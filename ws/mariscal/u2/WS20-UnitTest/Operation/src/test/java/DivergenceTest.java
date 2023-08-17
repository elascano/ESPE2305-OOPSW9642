/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mesias Mariscal
 */
public class DivergenceTest {
    
    public DivergenceTest() {
    }

    @org.junit.jupiter.api.Test
    public void testComputeDivergence() {
        System.out.println("computeDivergence");
        int n = 10;
        int expResult = -5;
        int result = Divergence.computeDivergence(n);
        assertEquals(expResult, result);
    }
    
}
