public class PhysicsFormula {
    public static void cover() {
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("Subject: Oriented Objects Programming");
        System.out.println("NRC: 9642");
        System.out.println("INSTRUCTOR: Edison Lascano");
        System.out.println("Height Calculator \n");
    }

    public static double heightCalculator(double initialVelocity, double finalVelocity, double time) {
        double height;
        height = ((initialVelocity + finalVelocity) / 2) * time;
        return (height);
    }

    public static void screen(double initialVelocity, double finalVelocity, double time, double height) {
        System.out.println("The Initial Velocity is: " + initialVelocity);
        System.out.println("The Final Velocity is: " + finalVelocity);
        System.out.println("The Time is: " + time);
        System.out.println("Formula: ((v0+vf)*t)/2");
        System.out.println("The height is: " + height);
    }

    public static void main(String[] args) {
        double initialVelocity, finalVelocity, time, height;
        cover();
        initialVelocity = 25;
        finalVelocity = 90;
        time = 20;
        height = heightCalculator(initialVelocity, finalVelocity, time);
        screen(initialVelocity, finalVelocity, time, height);

    }
}
