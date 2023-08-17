/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.controller;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public String sort(int data[]) {
        try {
           int size = data.length;
            sortingStrategy = setSortStrategy(size);
            return sortingStrategy.sort(data); 
        } catch (Exception e) {
            System.out.println("There is some problem with array size");
        } 
        
        return "";
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 3) {
            sortingStrategy = new BubbleSort();
        } else if (n >= 4 && n < 8) {
            sortingStrategy = new InsertionSort();
        } else if (n >= 8) {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
