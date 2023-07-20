/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec.edu.espe.student.view;
import ec.edu.espe.student.model.Save;
import ec.edu.espe.student.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class Team6Student {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        addStudents(students);
        Save.saveToCSV(students, "students.csv");
    }

    public static void addStudents(List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students to add: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student ID: ");
            String id = scanner.nextLine();
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student cell phone number: ");
            String cellPhoneNumber = scanner.nextLine();
            System.out.println("Enter student NRC: ");
            String nrc = scanner.nextLine();
            students.add(new Student(id, name, cellPhoneNumber, nrc));
        }
    }
}