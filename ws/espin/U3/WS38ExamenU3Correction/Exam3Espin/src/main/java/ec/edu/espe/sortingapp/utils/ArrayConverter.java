package ec.edu.espe.sortingapp.utils;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public abstract class ArrayConverter {
    
    public static int[] StringtoInteger(String[] array) {
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }
    
    public static String[] IntegerToString(int[] array) {
        String[] stringArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            stringArray[i] = Integer.toString(array[i]);
        }
        return stringArray;
    }
    
}