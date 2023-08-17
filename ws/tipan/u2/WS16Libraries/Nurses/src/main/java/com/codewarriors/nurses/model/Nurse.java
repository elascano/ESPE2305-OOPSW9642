
package com.codewarriors.nurses.model;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Nurse {
    public Nurce(int id, int age, String name, String department) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.department = department;
    }
    
        private int id;
        private int age;
        private String name;
        private String department;

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
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
