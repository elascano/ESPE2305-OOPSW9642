

package ec.edu.espe.sortapp.model;

import ec.edu.espe.sortapp.controller.SortingController;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Sorting implements Mapeable{
    int id;
    private int [] unsorted;
    private int size;
    private String sortAlgorithm;
    private int [] sorted;
    
    private HashMap<Object, Object> data;

    public Sorting(int[] unsorted, int size, String sortAlgorithm, int[] sorted) {
        this.id = SortingController.getInstance().generateId();
        this.unsorted = unsorted;
        this.size = size;
        this.sortAlgorithm = sortAlgorithm;
        this.sorted = sorted;
        
        data = new HashMap<>();
        data.put("id", id);
        data.put("unsorted", unsorted);
        data.put("size", size);
        data.put("sortAlgorithm", sortAlgorithm);
        data.put("sorted", sorted);
    }
    
    public int[] getUnsorted() {
        return unsorted;
    }

    public void setUnsorted(int[] unsorted) {
        this.unsorted = unsorted;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] getSorted() {
        return sorted;
    }

    public void setSorted(int[] sorted) {
        this.sorted = sorted;
    }
    
    @Override
    public HashMap<Object, Object> getData() {
        
        return data;
    }
}
