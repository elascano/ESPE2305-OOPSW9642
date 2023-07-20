package ec.edu.espe.SlopeFormule.view;

import ec.edu.espe.SlopeFormule.model.CoordinatesAxis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class CreateCSV {
  
  public static void generateCSV(List<CoordinatesAxis> coordinatesList, String filename) {
    try (FileWriter writer = new FileWriter(filename)) {
      writer.append("X-axis_1;Y-axis_1;X-axis_2;Y-axis_2;Slope\n");
      
      for (CoordinatesAxis coordinates : coordinatesList) {
        float x1Axis = coordinates.getX1Axis();
        float y1Axis = coordinates.getY1Axis();
        float x2Axis = coordinates.getX2Axis();
        float y2Axis = coordinates.getY2Axis();
        float slope = coordinates.getSlope();
        
        writer.append(String.valueOf(x1Axis)).append(";")
              .append(String.valueOf(y1Axis)).append(";")
              .append(String.valueOf(x2Axis)).append(";")
              .append(String.valueOf(y2Axis)).append(";")
              .append(String.valueOf(slope)).append(";");
      }
      
      writer.flush();
      System.out.println("The CSV file was successfully created: " + filename);
    } catch (IOException e) {
      System.out.println("We couldn't create the .csv file :(");
    }
  }
}
