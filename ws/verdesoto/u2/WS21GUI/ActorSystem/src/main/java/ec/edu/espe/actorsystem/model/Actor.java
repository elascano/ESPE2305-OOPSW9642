package ec.edu.espe.actorsystem.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Actor {
    private int id;
    private String name;
    private int age;
    private String movie;
    private long salary;

    @Override
    public String toString() {
        return "Actor{" + "id=" + id + ", name=" + name + ", age=" + age + ", movie=" + movie + ", salary=" + salary + '}';
    }

    public Actor(int id, String name, int age, String movie, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.movie = movie;
        this.salary = salary;
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
     * @return the movie
     */
    public String getMovie() {
        return movie;
    }

    /**
     * @param movie the movie to set
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * @return the salary
     */
    public long getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
}
