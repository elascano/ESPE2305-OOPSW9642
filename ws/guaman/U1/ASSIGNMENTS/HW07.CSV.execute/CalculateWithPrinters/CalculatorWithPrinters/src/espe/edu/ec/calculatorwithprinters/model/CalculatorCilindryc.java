package espe.edu.ec.calculatorwithprinters.model;

/**
 * Represents a calculator for calculating the volume of a cylindrical shape.
 * 
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class CalculatorCilindryc {
    public static float calculateVolume(float radius, float height) {
        float volume = 3.1416f * radius * radius * height;
        return volume;
    }
}
