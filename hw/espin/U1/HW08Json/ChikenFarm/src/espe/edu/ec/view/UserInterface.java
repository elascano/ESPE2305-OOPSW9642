package espe.edu.ec.view;

import espe.edu.ec.model.Chicken;
import espe.edu.ec.model.ChickenJsonFileManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {
    
    private ArrayList<Chicken> chickens = new ArrayList<>();
    private ChickenJsonFileManager dataHandler = new ChickenJsonFileManager("chickens.json");
    
    public void start() {
        ArrayList<Chicken> readChickens = dataHandler.readFromJson();
        if (readChickens != null) {
            chickens = readChickens;
        } else {
            chickens = new ArrayList<>();
        }

        System.out.println("GRANJA DE ANDRES");
        
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Chicken newChicken = inputCreateChicken();
                    chickens.add(newChicken);
                    dataHandler.writeToJson(chickens);
                    System.out.println("Nuevo pollo creado. Aquí están todos los pollos:");
                    for (Chicken chicken : chickens) {
                        System.out.println(chicken);
                    }
                    break;
                case 2:
                    editChicken();
                    dataHandler.writeToJson(chickens);
                    System.out.println("Pollo editado. Aquí están todos los pollos:");
                    for (Chicken chicken : chickens) {
                        System.out.println(chicken);
                    }
                    break;
                case 3:
                    deleteChicken();
                    dataHandler.writeToJson(chickens);
                    System.out.println("Pollo eliminado. Aquí están todos los pollos:");
                    for (Chicken chicken : chickens) {
                        System.out.println(chicken);
                    }
                    break;
                case 4:
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
    
    public Chicken inputCreateChicken() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el id del chicken: ");
        int id = scanner.nextInt();
        
        System.out.print("Ingrese el nombre del chicken: ");
        String name = scanner.next();
        
        System.out.print("Ingrese el color del chicken: ");
        String color = scanner.next();
        
        System.out.print("Ingrese el estado de chicken: ");
        boolean isMolting = scanner.nextBoolean();
        
        System.out.print("Ingrese el año en que nacio: ");
        int year = scanner.nextInt();
        
        System.out.print("Ingrese el mes en que nacio: ");
        int month = scanner.nextInt();
        
        System.out.print("Ingrese el dia en que nacio: ");
        int day = scanner.nextInt();

        Chicken chicken = new Chicken(id, name, color, isMolting, year, month, day);
        chickens.add(chicken);
        return chicken;
    }
    
    public void editChicken(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el id del chicken que quiere editar: ");
        int id = scanner.nextInt();

        for (int i = 0; i < chickens.size(); i++) {
            Chicken chicken = chickens.get(i);
            if (chicken.getId() == id) {
                System.out.print("Ingrese el nuevo nombre del chicken: ");
                String name = scanner.next();
                chicken.setName(name);

                System.out.print("Ingrese el nuevo color del chicken: ");
                String color = scanner.next();
                chicken.setColor(color);

                System.out.print("Ingrese el nuevo estado de chicken: ");
                boolean isMolting = scanner.nextBoolean();
                chicken.setIsMolting(isMolting);

                System.out.print("Ingrese el nuevo año en que nacio: ");
                int year = scanner.nextInt();

                System.out.print("Ingrese el nuevo mes en que nacio: ");
                int month = scanner.nextInt();

                System.out.print("Ingrese el nuevo dia en que nacio: ");
                int day = scanner.nextInt();

                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month - 1, day);
                Date newBornOnDate = calendar.getTime();
                chicken.setBornOnDate(newBornOnDate);

                int newAge = chicken.computeAge(newBornOnDate);
                chicken.setAge(newAge);

                return;
            }
        }

        System.out.println("No se encontró un pollo con la id proporcionada.");
    }



    
    public void deleteChicken() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el id del chicken que quiere eliminar: ");
        int id = scanner.nextInt();

        for (int i = 0; i < chickens.size(); i++) {
            if (chickens.get(i).getId() == id) {
                chickens.remove(i);
                System.out.println("El chicken con id " + id + " ha sido eliminado.");
                return;
            }
        }

        System.out.println("No se encontró un chicken con el id proporcionado.");
    }

    
    public void showMenu() {
        System.out.println("1. Añadir una gallina ");
        System.out.println("2. Editar una gallina");
        System.out.println("3. Borrar una gallina");
        System.out.println("4. Salir");
    }
}
