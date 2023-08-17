package com.jsons.mensualcalculator.model;

import com.jsons.tax.SalesTax;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class WorkingMan {

    @Override
    public String toString() {
        return "WorkingMan{" + "id=" + id + ", name=" + name + ", annualSalary=" + annualSalary + ", mensualSalary (income tax included) =" + mensualSalary + '}';
    }

    private int id;
    private String name;
    private float annualSalary;
    private float mensualSalary;
    
    public WorkingMan(int id, String name, float annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
        this.mensualSalary = SalesTax.computeIncomeTax(annualSalary);
    }
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the annualSalary
     */
    public float getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the mensualSalary
     */
    public float getMensualSalary() {
        return mensualSalary;
    }

    /**
     * @param mensualSalary the mensualSalary to set
     */
    public void setMensualSalary(float mensualSalary) {
        this.mensualSalary = mensualSalary;
    }
    
}
