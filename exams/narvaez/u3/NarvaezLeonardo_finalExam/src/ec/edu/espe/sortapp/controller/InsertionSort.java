
package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public class InsertionSort extends SortingStrategy {

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
        listOfDigits.setSortAlgorithm("Insert sort");
        listOfDigits.setSizeOfListOfNumbers(listOfDigits.getNumbersDisordered().length);
        listOfDigits.setNumbersDisordered(Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigitsAux.length));
    }
}
