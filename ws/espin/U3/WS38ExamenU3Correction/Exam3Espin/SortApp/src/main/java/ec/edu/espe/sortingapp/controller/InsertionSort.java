package ec.edu.espe.sortingapp.controller;

import java.util.ArrayList;

/**
 *
 * @author caeta
 */
public class InsertionSort extends SortingStrategy{
    @Override
    public int[] sort(int[] numbers){
        System.out.println("Insertion sort");
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }

}
