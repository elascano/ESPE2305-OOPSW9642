package ec.edu.espe.student.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.student.model.Student;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Main {

    private static final String FILE_NAME = "Student.json";
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        loadStudentsFromFile();

        System.out.println("-----------------------------");
        System.out.println("-----------Students----------");
        System.out.println("-----------------------------");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    removeStudent(scanner);
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    saveStudentsToFile();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("\nAGREGAR ESTUDIANTE");
        Student student = new Student();

        System.out.print("Ingrese el ID del estudiante: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        student.setId(id);

        System.out.print("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("Ingrese el profesor del estudiante: ");
        String teacher = scanner.nextLine();
        student.setTeacher(teacher);

        System.out.print("Ingrese el curso del estudiante: ");
        String course = scanner.nextLine();
        student.setCourse(course);

        students.add(student);
        System.out.println("Estudiante agregado correctamente.");
    }

    private static void removeStudent(Scanner scanner) {
        System.out.println("\nELIMINAR ESTUDIANTE");
        System.out.print("Ingrese el ID del estudiante a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                found = true;
                System.out.println("Estudiante eliminado correctamente.");
                break;
            }
        }

        if (!found) {
            System.out.println("No se encontró ningún estudiante con el ID especificado.");
        }
    }

    private static void displayStudents() {
        System.out.println("\nLISTA DE ESTUDIANTES");
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void loadStudentsFromFile() {
        File file = new File(FILE_NAME);

        try (Scanner scanner = new Scanner(file)) {
            StringBuilder jsonString = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonString.append(scanner.nextLine());
            }

            Gson gson = new Gson();
            Student[] studentArray = gson.fromJson(jsonString.toString(), Student[].class);
            students.clear();
            for (Student student : studentArray) {
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar estudiantes desde el archivo: " + e.getMessage());
        }
    }

    private static void saveStudentsToFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(students);

        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            pw.write(jsonString);
            pw.flush();
        } catch (Exception e) {
            System.out.println("Error al guardar estudiantes en el archivo: " + e.getMessage());
        }
    }
}
