package ec.edu.espe.AnimalSystem.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Animal {
    
    Date bornOnDate;
    private int age;
    private boolean feed;
    String born;
    
    ArrayList<Claw> claw;

    public int getAge() {
        return age;
    }
   
    public boolean Feed() {
        return feed;
    }
    
    public String Born(){
       
        return born;
    }
    
    
}
