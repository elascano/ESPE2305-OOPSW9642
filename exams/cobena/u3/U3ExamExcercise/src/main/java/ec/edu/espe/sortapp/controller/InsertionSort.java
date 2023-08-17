
package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy{
    @Override
    public int[] sort(int[] arrayToSort) {
        int n = arrayToSort.length;

        for (int i = 1; i < n; i++) {
            int flag = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > flag) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = flag;
        }
        
        return arrayToSort;
    }
}
