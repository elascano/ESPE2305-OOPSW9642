/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.codewarriors.seriesmath;

import com.codewarriors.seriesmath.SerieFibonacci;
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
public class SerieFibonacciTest {
    
    public SerieFibonacciTest() {
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
     * Test of calculateSeries method, of class SerieFibonacci.
     */
    @Test
    public void testCalculateSeries() {
        System.out.println("calculateSeries");
        int number = 1;
        SerieFibonacci.calculateSeries(number);

    }
    
}
