package ec.edu.espe.student.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Save {
    public static void saveToCSV(List<Student> students, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append("ID;Name;Cell Phone Number;NRC\n");
            for (Student student : students) {
                writer.append(String.valueOf(student.getId()))
                        .append(";")
                        .append(student.getName())
                        .append(";")
                        .append(student.getCellPhoneNumber())
                        .append(";")
                        .append(student.getNrc())
                        .append("\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
