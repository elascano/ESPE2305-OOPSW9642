package ec.edu.espe.areacalculator.view;

import ec.edu.espe.areacalculator.model.FormulaArea;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVGenerator {
    public static void generateCSV(List<FormulaArea> areas, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.append("Diameter;Area\n");
            for (FormulaArea area : areas) {
                float diameter = area.getDiameter();
                float circleArea = area.calculateCircleArea();
                writer.append(String.format("%.2f;%.4f\n", diameter, circleArea));
            }
            writer.flush();
            writer.close();
            System.out.println(".csv generated: " + filename);
        } catch (IOException e) {
            System.out.println("Error generating .csv file: " + e.getMessage());
        }
    }
}
