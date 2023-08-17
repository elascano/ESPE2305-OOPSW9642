/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.Numbers;

/**
 *
 * @author Alexander Jumbo
 */
public class SortingContext {
    
      private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public SortingStrategy setSortStrategy(int[] listOfDigits, Numbers listDigits) {

        if (listOfDigits.length < 4 && listOfDigits.length >= 0) {

            sortingStrategy = new BubbleSort();

        } else if (listOfDigits.length >= 4 && listOfDigits.length <= 7) {

            sortingStrategy = new InsertionSort();

        } else if (listOfDigits.length > 7) {

            sortingStrategy = new QuickSort();

        }
        return sortingStrategy;
    }
   
}
