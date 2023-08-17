
package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public class BubbleSort extends SortingStrategy {

    @Override
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
        listOfDigits.setSortAlgorithm("Bubble sort");
        listOfDigits.setSizeOfListOfNumbers(listOfDigits.getNumbersDisordered().length);
        listOfDigits.setNumbersDisordered(Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigitsAux.length));
    }

}
