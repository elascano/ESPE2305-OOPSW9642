/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.controller;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class BubbleSort extends SortingStrategy{

    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
        return nums;
    }
}