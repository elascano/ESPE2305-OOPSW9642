/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.strategyfinalexam.model;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Array {
    private int unsorted[];
    private int sorted[];
    private String sortAlgorithm;
    
    public int[] getUnsorted() {
        return unsorted;
    }

    public int[] getSorted() {
        return sorted;
    }

    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setUnsorted(int[] unsorted) {
        this.unsorted = unsorted;
    }

    public void setSorted(int[] sorted) {
        this.sorted = sorted;
    }

    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    
    
}
