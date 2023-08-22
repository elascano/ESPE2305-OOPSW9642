/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.SortApp.controller;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;

    public int[] sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if(n>1 && n<5){
            sortingStrategy = new BubbleSort();
        }
        
        if(n >=6 && n<10){
            sortingStrategy = new InsertionSort();
        }
        
        if (n >=11){
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
