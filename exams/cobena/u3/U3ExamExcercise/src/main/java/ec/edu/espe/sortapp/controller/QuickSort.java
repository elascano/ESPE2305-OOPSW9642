

package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy{
    @Override
    public int[] sort(int[] arrayToSort) {
        int low = 0;
        int high = arrayToSort.length - 1;
        
        if (low < high) {
            int pivotIndex = partition(arrayToSort, low, high);
            partitionSort(arrayToSort, low, pivotIndex - 1);
        }
        
        return arrayToSort;
    }
    
    public static void partitionSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            partitionSort(arr, low, pivotIndex - 1);
            partitionSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arrayToSort, int low, int high) {
        int pivot = arrayToSort[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arrayToSort[i] <= pivot) {
                i++;
            }
            while (j >= low && arrayToSort[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = temp;
            }
        }
        arrayToSort[low] = arrayToSort[j];
        arrayToSort[j] = pivot;
        
        return j;
    }
}