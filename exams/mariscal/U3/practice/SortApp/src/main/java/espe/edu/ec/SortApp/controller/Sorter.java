/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.SortApp.controller;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class Sorter {
    public int[] sortNumbers(String input) {
        if (input.matches("\\d+")) {
            int[] numbers = new int[input.length()];
            for (int i = 0; i < input.length(); i++) {
                numbers[i] = Character.getNumericValue(input.charAt(i));
            }
            SortingContext sortingContext = new SortingContext();
            return sortingContext.sort(numbers);
        } else {
            input = input.replaceAll("[^0-9]+", " ");
            String[] inputArray = input.trim().split("\\s+");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            SortingContext sortingContext = new SortingContext();
            return sortingContext.sort(numbers);
        }
    }
}
