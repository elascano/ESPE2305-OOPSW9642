package ec.edu.espe.sortingapp.controller;

import java.util.ArrayList;

/**
 *
 * @author caeta
 */
public class SortingContext {
    
    int[] unsorted;
    private SortingStrategy sortingStrategy;

    public SortingContext(int[] unsorted) {
        this.unsorted = unsorted;
    }
    
    public int[] sort() {
        setSortStrategy();
        int[] sortedNumbers = getSortingStrategy().sort(unsorted);
        return sortedNumbers;
    }
    
    public void setSortStrategy() {
        int numbersSize = unsorted.length;
        if (numbersSize < 1) {
            return;
        }
        else if(numbersSize >= 2 && numbersSize <= 5) {
            sortingStrategy = new BubbleSort();
        }
        
        else if(numbersSize >= 6 && numbersSize <= 10) {
            sortingStrategy = new InsertionSort();
        }
        
        else if(numbersSize > 10) {
            sortingStrategy = new QuickSort();
        }
    }

    /**
     * @return the sortingStrategy
     */
    public SortingStrategy getSortingStrategy() {
        return sortingStrategy;
    }
}
