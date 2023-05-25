
package ec.edu.espe.angularspeed1.view;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
import ec.edu.espe.angularspeed1.model.AngularSpeedModel;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AngularSpeedView {
    private AngularSpeedModel model;

    public AngularSpeedView(AngularSpeedModel model) {
        this.model = model;
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angular displacement (in radians): ");
        double angularDisplacement = scanner.nextDouble();
        System.out.print("Enter the time (in seconds): ");
        double time = scanner.nextDouble();
        model.setAngularDisplacement(angularDisplacement);
        model.setTime(time);
    }

    public void displayAngularSpeed(double angularSpeed) {
        System.out.println("Angular Speed: " + angularSpeed + " radians per second");
    }

    public void saveToCSV(double angularDisplacement, double time, double angularSpeed) {
        try {
            FileWriter writer = new FileWriter("angular_speed.csv", true);
            writer.append(angularDisplacement + "," + time + "," + angularSpeed + "\n");
            writer.close();
            System.out.println("Data saved to angular_speed.csv");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the data to CSV.");
            e.printStackTrace();
        }
    }
}

