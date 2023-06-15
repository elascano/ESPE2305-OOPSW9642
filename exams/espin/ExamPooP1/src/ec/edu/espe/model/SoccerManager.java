
package ec.edu.espe.model;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class SoccerManager {
    private int id;
    private String name;
    private int winCup;

    public SoccerManager(int id, String name, int winCup) {
        this.id = id;
        this.name = name;
        this.winCup = winCup;
    }

    @Override
    public String toString() {
        return "SoccerManger{" + "id=" + id + ", name=" + name + ", winCup=" + winCup + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWinCup() {
        return winCup;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWinCup(int winCup) {
        this.winCup = winCup;
    }
    
    
}
