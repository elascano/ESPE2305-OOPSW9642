
package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public class QuickSort extends SortingStrategy {

    @Override
    public void sort(Numbers listOfDigits) {
        int high;
        int numbers[] = Arrays.copyOf(listOfDigits.getNumbersDisordered(), listOfDigits.getNumbersDisordered().length);
        high = listOfDigits.getNumbersDisordered().length;

        sort(numbers, 0, high - 1, listOfDigits);

    }

    private static void Data(int array[], Numbers listOfDigits) {
        listOfDigits.setListOfNumberOrdered(array);
        listOfDigits.setSortAlgorithm("Quick sort");
        listOfDigits.setSizeOfListOfNumbers(listOfDigits.getNumbersDisordered().length);
        listOfDigits.setNumbersDisordered(Arrays.copyOf(listOfDigits.getNumbersDisordered(), array.length));
    }

    public static void sort(int number[], int start, int fin, Numbers listOfDigits) {
        if (start >= fin) {
            return;
        }
        int pivot = number[start];
        int left = start + 1;
        int right = fin;

        while (left <= right) {
            while (left <= fin && number[left] < pivot) {
                left++;
            }
            while (right > start && number[right] >= pivot) {
                right--;
            }
            if (left < right) {
                int temporary = number[left];
                number[left] = number[right];
                number[right] = temporary;
            }
        }
        if (right > start) {
            int temporary = number[start];
            number[start] = number[right];
            number[right] = temporary;
        }
        sort(number, start, right - 1, listOfDigits);
        sort(number, right + 1, fin, listOfDigits);
        Data(number, listOfDigits);
    }

}
