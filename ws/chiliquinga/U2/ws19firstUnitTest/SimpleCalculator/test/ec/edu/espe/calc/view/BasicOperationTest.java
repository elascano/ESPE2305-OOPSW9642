/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.calc.view;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuhed = 0.0F;
        float substrahed = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtruct(minuhed, substrahed);
        assertEquals(expResult, result, 0);
    }
    
}
