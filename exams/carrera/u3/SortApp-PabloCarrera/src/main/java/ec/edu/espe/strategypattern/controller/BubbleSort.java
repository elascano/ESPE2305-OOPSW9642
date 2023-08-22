/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class BubbleSort extends SortingStrategy{

    @Override
    public int[] sort(int[] unsortedNumbers) {
        int n = unsortedNumbers.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (unsortedNumbers[j] > unsortedNumbers[j+1]) {
                    int temp = unsortedNumbers[j];
                    unsortedNumbers[j] = unsortedNumbers[j+1];
                    unsortedNumbers[j+1] = temp;
                }
            }
        }
        return unsortedNumbers;
    }
}
