/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.student.model;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */

public class Student {
    private String id;
    private String name;
    private String cellPhoneNumber;
    private String nrc;

    public Student(String id, String name, String cellPhoneNumber, String nrc) {
        this.id = id;
        this.name = name;
        this.cellPhoneNumber = cellPhoneNumber;
        this.nrc = nrc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }
}