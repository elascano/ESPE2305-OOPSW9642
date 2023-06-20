/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.shoes.model;

/**
 *
 * @author caeta
 */
public class Customer {
    private String name;
    private float salary;
    private float finalSalary;

    @Override
    public String toString() {
        return "name = " + getName() + "\nsalary = " + getSalary() + "\nfinalSalary = " + getFinalSalary();
    }
    
    
    public Customer(String name, float salary, float finalSalary) {
        this.name = name;
        this.salary = salary;
        this.finalSalary = finalSalary;
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
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the finalSalary
     */
    public float getFinalSalary() {
        return finalSalary;
    }

    /**
     * @param finalSalary the finalSalary to set
     */
    public void setFinalSalary(float finalSalary) {
        this.finalSalary = finalSalary;
    }
}
