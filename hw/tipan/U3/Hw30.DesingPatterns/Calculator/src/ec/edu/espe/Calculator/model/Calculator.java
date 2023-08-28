package ec.edu.espe.Calculator.model;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Calculator {
    
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    
}
