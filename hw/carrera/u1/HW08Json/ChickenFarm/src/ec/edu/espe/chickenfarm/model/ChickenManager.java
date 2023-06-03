package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class ChickenManager {
    private Chicken chicken;
    private ArrayList<Chicken>chickens = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    
    public void addChicken(){
        int id;
        String name;
        String color;
        boolean isMolting;
        Date bornOnDate;
        int year;
        int month;
        int day;
            
        
        System.out.println("Input id: ");
        id = getScan().nextInt();
        getScan().nextLine();
        System.out.println("Input name: ");
        name = getScan().nextLine();
        System.out.println("Input color: ");
        color = getScan().nextLine();
        System.out.println("Input isMolting: ");
        isMolting = getScan().nextBoolean();
        System.out.println("Input born year");
        year = getScan().nextInt();
        System.out.println("Input born month");
        month = getScan().nextInt();
        System.out.println("Input born day");
        day = getScan().nextInt();
        bornOnDate = new Date(year, month,day);
        
        setChicken(new Chicken(id, name, color, isMolting, bornOnDate));
        getChickens().add(getChicken());
        
        System.out.println("Chicken added correctly");
        
    }

    /**
     * @return the chicken
     */
    public Chicken getChicken() {
        return chicken;
    }

    /**
     * @param chicken the chicken to set
     */
    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    /**
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    /**
     * @return the scan
     */
    public Scanner getScan() {
        return scan;
    }

    /**
     * @param scan the scan to set
     */
    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
