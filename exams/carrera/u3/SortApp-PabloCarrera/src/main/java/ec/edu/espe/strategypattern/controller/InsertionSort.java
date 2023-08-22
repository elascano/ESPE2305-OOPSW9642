/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class InsertionSort extends SortingStrategy{

    @Override
    public int[] sort(int[] unsortedNumbers) {
        System.out.println("Insertion sort");
        int n = unsortedNumbers.length;
        for (int i = 1; i < n; ++i) {
            int key = unsortedNumbers[i];
            int j = i - 1;
            while (j >= 0 && unsortedNumbers[j] > key) {
                unsortedNumbers[j + 1] = unsortedNumbers[j];
                j = j - 1;
            }
            unsortedNumbers[j + 1] = key;
        }
        return unsortedNumbers;
    }
    
}
