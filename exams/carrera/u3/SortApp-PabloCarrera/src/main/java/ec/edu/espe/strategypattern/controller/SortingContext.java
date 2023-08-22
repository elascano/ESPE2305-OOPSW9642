/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class SortingContext {
    SortingStrategy sortingStrategy;
    private String strategy;
    
    public int[] sort(int[] unsortedNumbers) {
        setSortStrategy(unsortedNumbers);
        int[] sortedNumbers;
        sortedNumbers = sortingStrategy.sort(unsortedNumbers);
        return sortedNumbers;
    }
    
    public void setSortStrategy(int[] unsortedNumbers) {
        int numbersLenght = unsortedNumbers.length;
        
        if (numbersLenght <= 1) {
            sortingStrategy = null;
        }
        else if(numbersLenght >= 2 && numbersLenght <= 5) {
            sortingStrategy = new BubbleSort();
            strategy = "BubbleSort";
        }
        else if(numbersLenght >= 6 && numbersLenght <= 10) {
            sortingStrategy = new InsertionSort();
            strategy = "InsertionSort";
        }
        else if(numbersLenght >= 11) {
            sortingStrategy = new QuickSort();
            strategy = "QuickSort";
        }
    }

    /**
     * @return the strategy
     */
    public String getStrategy() {
        return strategy;
    }
    
}
