/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.controller;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class InsertionSort extends SortingStrategy{

    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            
            nums[j + 1] = key;
        }
        
        return nums;
    }
    
}
