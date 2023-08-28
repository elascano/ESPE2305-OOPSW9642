/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exercise.model;

/**
 *
 * @author Alexander J
 */
public class Parks {

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getCourts() {
        return courts;
    }

    public void setCourts(String courts) {
        this.courts = courts;
    }
    private  String chair;
    private String tree;
    private String courts;
     
 public Parks(String chair, String courts, String tree){
        this.chair = chair;
        this.courts = courts;
        this.tree = tree;
    }
}
       
   

