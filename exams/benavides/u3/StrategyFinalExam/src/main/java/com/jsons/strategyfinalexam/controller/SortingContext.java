/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.controller;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int[] sort(int nums[]){
        int size = nums.length;
        sortingStrategy = (SortingStrategy) setSortStrategy(size);
        return sortingStrategy.sort(nums);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>1 && n <6){
            sortingStrategy = new BubbleSort();
        }
        
        if(n>=6 && n<11){
            //sortingStrategy = new InsertionSort();
        }
        
        if(n>11){
            //sortingStrategy = new QuickSort();
        }
        
        return sortingStrategy;
    }
}
