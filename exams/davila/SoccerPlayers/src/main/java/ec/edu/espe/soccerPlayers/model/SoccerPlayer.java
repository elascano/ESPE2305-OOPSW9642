/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.soccerPlayers.model;

/**
 *
 * @author USER
 */
public class SoccerPlayer {
    private int id;
    private String name;
    private int age;
    private int number;

    public SoccerPlayer(int id, String name, int age, int number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "id=" + id + ", name=" + name + ", age=" + age + ", number=" + number + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

  
    
}
