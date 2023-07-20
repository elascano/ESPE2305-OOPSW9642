package ec.edu.espe.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Student {
 int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCurse() {
        return Curse;
    }

    public void setCurse(String Curse) {
        this.Curse = Curse;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
 String Name;
 String Curse;
 int Age;
 
    public static String userCi;

    public Student() {
    }

    public static String getUserCi() {
        return userCi;
    }

    public static void setUserCi(String userCi) {
        Student.userCi = userCi;
    }
    
}
