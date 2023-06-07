
package ec.edu.espe.chickenFarm.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class Chicken {
    private final int id;
    private final String name;
    private final String color;
    private final boolean isMolting;
    private final LocalDate bornOnDate;

    public Chicken(int id, String name, String color, boolean isMolting, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = LocalDate.of(yearOfBirth, 1, 1);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isMolting() {
        return isMolting;
    }

    public int getAgeInYears() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(bornOnDate, currentDate);
        return age.getYears();
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isMolting=" + isMolting +
                ", age=" + getAgeInYears() +
                '}';
    }
}