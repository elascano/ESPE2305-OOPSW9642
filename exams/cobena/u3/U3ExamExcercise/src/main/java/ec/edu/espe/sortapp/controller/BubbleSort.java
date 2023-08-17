

package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] arrayToSort) {
        int arraySize = arrayToSort.length;

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int aux = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = aux;
                }
            }
        }
        
        return arrayToSort;
    }

}
