package ec.edu.espe.sortingapp.controller;

import java.util.ArrayList;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class BubbleSort extends SortingStrategy{

    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Bubble sort");
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
    
}
