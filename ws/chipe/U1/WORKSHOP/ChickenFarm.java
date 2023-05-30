
package ec.edu.espe.chickenfarm.model;

import javax.lang.model.SourceVersion;
/**
 *
 * @author Pamela Chipe,The javas,KillChainTeam
 */
public class chickenfarm {
    
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    
}
public class chickenfarm{
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        //1
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);
        //2
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(2, "maruja", "w", true, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        //3
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(3, "Lola", "b", false, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        //4
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(4, "Josefa", "o", true, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //5
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(5, "Linda", "5", true, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //6
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(6, "Juanita", "m", false, new Date());
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //7
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(7, "Martha", "y", true, new Date());
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //8
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(8, "lili", "n", false, new Date());
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //9
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(9, "Jacinta", "p", true, new Date());
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //10
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(10, "Alexsa", "l", false, new Date());
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //Coop 1
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("coop --> " + coop);
        //Coop 2
        coop2 = new Coop(2, chickens2);
        System.out.println("chickens2 -->" + chickens2);
        System.out.println("coop2 --> " + coop2 );
     
        
    }
}