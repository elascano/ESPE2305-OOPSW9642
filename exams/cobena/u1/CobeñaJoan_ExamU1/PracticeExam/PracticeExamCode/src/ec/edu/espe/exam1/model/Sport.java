package ec.edu.espe.exam1.model;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Sport {
    private int id;
    private String name;
    private String tournament;

    public Sport() {
    }

    public Sport(int id, String name, String tournament) {
        this.id = id;
        this.name = name;
        this.tournament = tournament;
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

    public String getTournaments() {
        return tournament;
    }

    public void setTournaments(String tournament) {
        this.tournament = tournament;
    }
}
