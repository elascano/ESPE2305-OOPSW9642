
package ec.edu.espe.finalexam.controller;

import ec.edu.espe.finalexam.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public SortingStrategy setSortStrategy(int[] listOfDigits, Numbers listDigits) {

        if (listOfDigits.length < 4 && listOfDigits.length >= 0) {

            sortingStrategy = new BubbleSort();

        } else if (listOfDigits.length >= 4 && listOfDigits.length <= 7) {

            sortingStrategy = new InsertionSort();

        } else if (listOfDigits.length > 7) {

            sortingStrategy = new QuickSort();

        }
        return sortingStrategy;
    }
}
