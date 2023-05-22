package espe.edu.ec.model;

/**
 *
 * @author Andres Espin, The javas, DCOO-ESPE
 */
import java.util.*;
import java.io.*;


public class CSVFileHandler {
    private String fileName;
    
    public CSVFileHandler(String fileName){
        this.fileName=fileName;
    }
    public void writeData(Triangle triangle) {
        File f = new File(fileName);
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            if (f.length() == 0) {
                writer.println("Base;Height;Side1;Side2;Side3");
            }
            writer.println(triangle.getBase() + ";" + triangle.getHeight() + ";" +
                           triangle.getSideOne() + ";" + triangle.getSideTwo() + ";" + triangle.getSideThree());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    
    public List<Triangle> readData(){
        List<Triangle> triangles=new ArrayList<>();
        try(Scanner scanner =new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String[] data=scanner.nextLine().split(";");
                Triangle triangle=new Triangle(Double.parseDouble(data[0]), Double.parseDouble(data[1]),
                                                 Double.parseDouble(data[2]), Double.parseDouble(data[3]),
                                                 Double.parseDouble(data[4]));
                triangles.add(triangle);
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no funciona o no abre: " + e.getMessage());
        }
        return triangles;
    }
    
}
