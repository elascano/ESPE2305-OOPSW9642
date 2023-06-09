
package ec.edu.espe.Singer.model;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class Singer {
    private int id;
    private String name;
    private int age;

    public Singer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters

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
}
