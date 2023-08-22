/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Alexander Jumbo
 */
public class InsertionSort {
    
    @Override
    public void sort(Numbers listOfDigits) {
        
        int n = listOfDigits.getNumbersDisordered().length;
        int[] listOfDigitsAux = Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigits.getNumbersDisordered().length);
        for (int i = 1; i < n; ++i) {
            int key = listOfDigitsAux[i];
            int j = i - 1;
  
            
            while (j >= 0 && listOfDigitsAux[j] > key) {
                listOfDigitsAux[j + 1] = listOfDigitsAux[j];
                j = j - 1;
            }
            listOfDigitsAux[j + 1] = key;
        }
        
        Data(listOfDigitsAux, listOfDigits);
    }
    
    private static void Data(int[] listOfDigitsAux, Numbers listOfDigits) {
        listOfDigits.setListOfNumberOrdered(listOfDigitsAux);
        listOfDigits.setSortAlgorithm("InsertSort");
        listOfDigits.setSizeOfListOfNumbers(listOfDigits.getNumbersDisordered().length);
        listOfDigits.setNumbersDisordered(Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigitsAux.length));
    }
}
