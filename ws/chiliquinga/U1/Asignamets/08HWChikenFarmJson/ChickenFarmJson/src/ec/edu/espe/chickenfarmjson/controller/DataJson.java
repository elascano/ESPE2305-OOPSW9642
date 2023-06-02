package ec.edu.espe.chickenfarmjson.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarmjson.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class DataJson {
    public void DataJson(){
        Scanner scanner = new Scanner(System.in);
        
        Chicken chicken ;
        
        //TODO: poner things en el array
        System.out.print("Enter id chicken: ");
        int id = scanner.nextInt();
        System.out.print("Enter name of chicken: ");
        String name = scanner.next();
        System.out.print("Enter color of chicken: ");
        String color = scanner.next();
        System.out.print("Enter if you chicken is moulting (true or false): ");
        boolean isMolting = scanner.nextBoolean();
        System.out.print("Enter chicken birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter chicken birth month: ");
        int month = scanner.nextInt();
        System.out.print("Enter chicken birth day: ");
        int day = scanner.nextInt();
        
        
        chicken = new Chicken(id, name, color, isMolting, new Date(year - 1900, month -1, day));
        int age = chicken.getAge();
        chicken.setId(id);
        
        //TODO: converter the date to JSON
        Gson gson =  new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(chicken);
        
        WriteJson write = new WriteJson();
        write.WriteJson(jsonString, "chickens.json");
    }
}
