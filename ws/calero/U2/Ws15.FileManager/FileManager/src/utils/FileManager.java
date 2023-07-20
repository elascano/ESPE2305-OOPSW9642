package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class FileManager {
    
    
    
    public static void save(Cellphone cellphone){
        try {
            FileOutputStream archivo = new FileOutputStream("cellphonesObjects.txt", true);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
    
            salida.writeObject(cellphone);    
            salida.close();
            archivo.close();
            
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    public static void read(Cellphone cellphone){
        try {
            FileInputStream archivo = new FileInputStream("cellphonesObjects.txt");
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            cellphone = (Cellphone) entrada.readObject();
            entrada.close();
            archivo.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
