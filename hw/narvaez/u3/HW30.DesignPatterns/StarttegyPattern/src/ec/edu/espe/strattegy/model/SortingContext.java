/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strattegy.model;

import ec.edu.espe.strattegy.controller.QuickSort;

/**
 *
 * @author NarvaezLeonardo
 */
public class SortingContext {
     private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);

    }  
    
   public SortingStrategy setSortStrategy(int n) {
    if( n >0 && n < 30 )
        ss = new BubbleSort();
    if( n >= 30 && n < 100 )
        ss = new InsertionSort();
    if( n >= 100 )
        ss = (SortingStrategy) new QuickSort();
    return ss;
}
}
