/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.sortapp.model;

/**
 *
 * @author jnman
 */
public class QuickSort implements SortingStrategy{
    public int[] sort(int data[]) {
        
        int sortedData[];

        System.out.println("QuickSort");

        sortedData=quickSort(data, 0, data.length - 1);
        return sortedData;
    }

    private int[] quickSort(int[] data, int low, int high) {

        if (low < high) {
            int pi = part(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
        
        return data;

    }

    static int part(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }
    
}
