/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenFarmTutoria.model;

import java.util.Date;

/**
 *
 * @author Anabel Davila, killChainTeam, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;
    private Date todaysDate;
    private int day;
    private int month;
    private int year;
    
    
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + 
                ", color=" + color + ", age=" + age + 
                ", isMolting=" + isMolting + 
                ", bornOnDate=" + bornOnDate + '}';
    }
    
    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        //TODO code, compute age using the bornOnDate
        this.year = bornOnDate.getYear();
        this.month=bornOnDate.getMonth();
        this.day=bornOnDate.getDay();
       
        this.age=getAge(year, month, day);
        //these methods are deprecated
    }
    public int getAge(int year, int month, int day) {
    
              
        Date now = new Date();
    int nowMonth = now.getMonth();
    int nowYear = now.getYear();
    int result = nowYear - year;
    if (month > nowMonth) {
        result--;
    }
    else if (month == nowMonth) {
        int nowDay = now.getDay();

        if (day > nowDay) {
            result--;
        }
    }
    return result;
    }
    public Date computeAge(Date bornOnDate){
        //TODO code, compute age in years using born on date
        return new Date();
    }
    /**
     * @return the id
     */
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
    

    
}
