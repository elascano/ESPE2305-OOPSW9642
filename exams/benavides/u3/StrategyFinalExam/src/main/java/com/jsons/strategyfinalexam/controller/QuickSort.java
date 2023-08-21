/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.controller;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class QuickSort extends SortingStrategy{

    @Override
    public int[] sort(int[] nums){
        nums = sort(nums, 0, nums.length-1);
        return nums;
    }
    
    public int[] sort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            sort(nums, low, pi - 1);
            sort(nums, pi + 1, high);
        }
        
        return nums;
    }
    
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        
        return i + 1;
    }

}
