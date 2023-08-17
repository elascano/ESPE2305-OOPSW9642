/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.controller;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public String sort(int[] data) {
        int j, temp, size;
        
        System.out.println("InsertionSort");
        
        size = data.length;
        for (int i = 1; i < size; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && temp <= data[j]){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = temp;
        }
        
        return "InsertionSort";
    }
}