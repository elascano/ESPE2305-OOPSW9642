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
        System.out.println("El archivo se guardará en: " + f.getAbsolutePath());

        try (PrintWriter writer = new PrintWriter(new FileWriter(f, true))) {
            // Si el archivo no existe o no tiene contenido, escribimos el encabezado
            try (Scanner scanner = new Scanner(f)) {
                if (!scanner.hasNext()) {
                    writer.println("Base;Height;Side1;Side2;Side3;Area;Perimetro");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }

            writer.println(triangle.getBase() + ";" + triangle.getHeight() + ";" +
                            triangle.getSideOne() + ";" + triangle.getSideTwo() + ";" + triangle.getSideThree()+";"+triangle.getArea()+";"+triangle.getPerimeter());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }


    public List<Triangle> readData(){
        File f = new File(fileName);
        List<Triangle> triangles=new ArrayList<>();
        try(Scanner scanner =new Scanner(f)){
            while(scanner.hasNextLine()){
                String[] data=scanner.nextLine().split(";");
                if(!data[0].equals("Base")) {
                    Triangle triangle=new Triangle(Double.parseDouble(data[0]), Double.parseDouble(data[1]),
                                                    Double.parseDouble(data[2]), Double.parseDouble(data[3]),
                                                    Double.parseDouble(data[4]));
                    triangles.add(triangle);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no funciona o no abre: " + e.getMessage());
        }
        return triangles;
    }

}
