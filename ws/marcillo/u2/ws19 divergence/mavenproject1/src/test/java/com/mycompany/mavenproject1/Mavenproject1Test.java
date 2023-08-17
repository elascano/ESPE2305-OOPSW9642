/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class Mavenproject1Test {
    
    /**
     * Test of main method, of class Mavenproject1.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Mavenproject1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFactorial method, of class Mavenproject1.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateFactorial() {
        System.out.println("calculateFactorial");
        int number = 5;
        int expResult = 120;
        int result = Mavenproject1.calculateFactorial(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of evaluateNumber method, of class Mavenproject1.
     */
    @org.junit.jupiter.api.Test
    public void testEvaluateNumber() {
        System.out.println("evaluateNumber");
        int numberdi = 3;
        Mavenproject1.evaluateNumber(numberdi);
    }

    /**
     * Test of add method, of class Mavenproject1.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.0F;
        float addend2 = 4.0F;
        Mavenproject1 instance = new Mavenproject1();
        float expResult = 5.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of subtruct method, of class Mavenproject1.
     */
    @org.junit.jupiter.api.Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuhed = 5.0F;
        float substrahed = 2.0F;
        Mavenproject1 instance = new Mavenproject1();
        float expResult = 3.0F;
        float result = instance.subtruct(minuhed, substrahed);
        assertEquals(expResult, result, 0);

    }
    
}
