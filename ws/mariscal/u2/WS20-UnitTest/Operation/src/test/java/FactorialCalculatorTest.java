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
public class FactorialCalculatorTest {
    
    public FactorialCalculatorTest() {
    }

    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int n = 6;
        int expResult = 542;
        int result = FactorialCalculator.factorial(n);
        assertEquals(expResult, result);
    }
    
}
