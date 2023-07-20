package basic.operations;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicOperationsTest {

    @Test
    public void testCalculateFactorial() {
        System.out.println("calculateFactorial");
        int number = 5;
        int expResult = 120;
        int result = BasicOperations.calculateFactorial(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvaluateNumber() {
        System.out.println("evaluateNumber");
        int numberdi = 2;
        BasicOperations.evaluateNumber(numberdi);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 5.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuhed = 5.0F;
        float substrahed = 2.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 3.0F;
        float result = instance.subtruct(minuhed, substrahed);
        assertEquals(expResult, result, 0);
    }
}
