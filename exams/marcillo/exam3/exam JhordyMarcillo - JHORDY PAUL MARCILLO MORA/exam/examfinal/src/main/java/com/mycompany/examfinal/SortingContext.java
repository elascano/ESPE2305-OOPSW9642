/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examfinal;

/**
 *
 * @author Jhordy Marcillo
 */
public class SortingContext {

    private SortingStrategy sortStrategy;

    public int[] sort(int data[]) {

        int size = data.length;

        setSortStrategy(setSortStrategy(size));
        
        return getSortStrategy().sort(data);

    }
    
    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 5) {
            setSortStrategy(new BubbleSort());
        }

        if (n >= 6 && n < 10) {
            setSortStrategy(new InsertionSort());
        }

        if (n >= 11) {
            setSortStrategy(new QuickSort());
        }

        return getSortStrategy();

    }

    public SortingStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortingStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    
    
}
