/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.Ws08Collections.model;

import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;
    private int year;
    private int month;
    private int day;
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
        this.year=bornOnDate.getYear();
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
