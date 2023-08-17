

package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class SortingContext {
    public static int[] sort(int[] arrayToSort){
        int arraySize = arrayToSort.length;
        SortingStrategy sortingStrategy = setSortingStrategy(arraySize);
        
        return sortingStrategy.sort(arrayToSort);
    }
    
    public static SortingStrategy setSortingStrategy(int sizeOfArray){
        SortingStrategy sortingStrategy;
        if(sizeOfArray>1 && sizeOfArray<6 ){
            sortingStrategy = new BubbleSort();
        }
        else if(sizeOfArray>=6 && sizeOfArray<11){
            sortingStrategy = new InsertionSort();
        }
        else if(sizeOfArray>=11){
            sortingStrategy = new QuickSort();
        }
        else{
            sortingStrategy = null;
        }
        return sortingStrategy;
    }
}
