
public class CalculateWeight {
    public static void main(String[] args) throws Exception {
        double mass = 17.5;
        double gravity = 9.81;

        System.out.println("Hello, World!");
        System.out.println("Name: Yeshua Chiliquinga");
        System.out.println("NRC: 9642");
        System.out.println("Objects projecting programming");
        System.out.println("***************************************");
        System.out.println("Program that calculates the weight");
        System.out.println("***************************************");
        System.out.println("To calculate the weight "+"\n");

        System.out.println("Mass is: "+mass+" Kg");
        System.out.println("Gravity: "+ gravity + " m/(s^2)");
        CalculateWeight(mass, gravity);
    }

    public static void CalculateWeight(double mass, double gravity){
        double weight = (mass * gravity);
        System.out.println("The weight is: "+ weight +" Newtons");
    }
}
