package ec.edu.espe.chickenfarm.model;

import java.util.Scanner;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private int bornOnDate;
    
    public Chicken() {
        System.out.println("--Enter the chicken data--");
        System.out.println("Enter chicken id: ");
        while(true){
            try{
                Scanner idScanner = new Scanner(System.in);
                this.id = idScanner.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Error: " + e + "\n" + "Try again: ");
            }
        }
        System.out.println("Enter chicken name: ");
        while(true){
            try{
                Scanner nameScanner = new Scanner(System.in);
                this.name = nameScanner.nextLine();
                break;
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("Enter chicken color: ");
        while(true){
            try{
                Scanner colorScanner = new Scanner(System.in);
                this.color = colorScanner.nextLine();
                break;
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("Enter 'true' if chicken is molting or 'false' if not: ");
        while(true){
            try{
                Scanner isMoltingScanner = new Scanner(System.in);
                this.isMolting = isMoltingScanner.nextBoolean();
                break;
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("Enter chicken age: ");
        while(true){
            try{
                Scanner ageScanner = new Scanner(System.in);
                this.age = ageScanner.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("Enter chicken birthdate: ");
        while(true){
            try{
                Scanner bornOnDateScanner = new Scanner(System.in);
                this.bornOnDate = bornOnDateScanner.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + 
                ", age=" + age + ", isMolting=" + isMolting +
                ", bornOnDate=" + bornOnDate + '}';
    }
    
    /**
     * @return the bornOnDate
     */
    public int getBornOnDate() {
        return bornOnDate;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }


}
