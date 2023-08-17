package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int[] sort(int data[]){
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>1 && n<5){
            sortingStrategy = new BubbleSort();
        }
        
        if(n >=6 && n<10){
            sortingStrategy = new InsertionSort();
        }
        
        if (n >=11){
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
