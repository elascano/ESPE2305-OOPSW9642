public class AngularSpeed {

    public static void main(String[] args) {
        
        
        double angularSpeed, time, angularDisplacement;
        double  period, frequency, spin;      
        System.out.println("El valor de la velocidad angular es 45.65");
        angularSpeed=45.65;
        System.out.println("El valor del tiempo es 1.25");
        time=1.25;
        angularDisplacement=angularSpeed*time;
        spin=6.28;
        period=spin/angularSpeed;
        frequency=angularSpeed/spin;       
        System.out.println("El desplazamiento angular es:"+angularDisplacement);
        System.out.println("El periodo es:"+period);
        System.out.println("La frecuencia es:"+frequency);
    }
}
