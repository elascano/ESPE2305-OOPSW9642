/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategymaven;

/**
 *
 * @author USER
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size = data.length;
        ss = (SortingStrategy) setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n <30){
            ss = new BubbleSort();
        }
        
        if(n>=30 && n<100){
            ss = new InsertionSort();
        }
        
        if(n>=100){
            ss = new QuickSort();
        }
        
        return ss;
    }

}