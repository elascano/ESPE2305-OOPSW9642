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
public class BubbleSort extends SortingStrategy {
     
    public void sort(Numbers listOfDigits) {

        int[] listOfDigitsAux;

        listOfDigitsAux = Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigits.getNumbersDisordered().length);

        for (int i = 0; i < listOfDigits.getNumbersDisordered().length - 1; ++i) {

            for (int j = 0; j < listOfDigits.getNumbersDisordered().length - i - 1; ++j) {

                if (listOfDigitsAux[j + 1] < listOfDigitsAux[j]) {

                    int swap = listOfDigitsAux[j];
                    listOfDigitsAux[j] = listOfDigitsAux[j + 1];
                    listOfDigitsAux[j + 1] = swap;

                }
            }
        }

        Data(listOfDigitsAux, listOfDigits);
    }

    private static void Data(int[] listOfDigitsAux, Numbers listOfDigits) {
        listOfDigits.setListOfNumberOrdered(listOfDigitsAux);
        listOfDigits.setSortAlgorithm("BubbleSort");
        listOfDigits.setSizeOfListOfNumbers(listOfDigits.getNumbersDisordered().length);
        listOfDigits.setNumbersDisordered(Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigitsAux.length));
    }

    
}
