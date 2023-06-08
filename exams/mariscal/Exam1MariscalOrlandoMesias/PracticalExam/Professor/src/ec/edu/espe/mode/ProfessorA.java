/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.mode;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class ProfessorA {
    private int id;
    private String name;
    private String Subject;

    public ProfessorA(int id, String name, String Subject) {
        this.id = id;
        this.name = name;
        this.Subject = Subject;
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

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", materia=" + Subject + '}';
    }

}