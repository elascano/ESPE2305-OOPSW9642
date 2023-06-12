
package ec.edu.espe.Exsanp1.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Pamela Chipe,The javas,KillChainTeam
 */
public class Keyboards {


    private static class JSONArray {

        public JSONArray() {
        }

        private char[] toJSONString() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void add(JSONObject jsonObject) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

public class Keyboard {
    private final String id;
    private final String attribute1;
    private final String attribute2;

    public Keyboard(String id, String attribute1, String attribute2) {
        this.id = id;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public String getId() {
        return id;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Keyboard other = (Keyboard) obj;
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
            if (!Objects.equals(this.attribute1, other.attribute1)) {
                return false;
            }
            return Objects.equals(this.attribute2, other.attribute2);
        }

    private static void saveToJSON(ArrayList<Keyboard> keyboards) {
        JSONArray jsonArray = new JSONArray();

        for (Keyboard keyboard : keyboards) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", keyboard.getId());
            jsonObject.put("attribute1", keyboard.getAttribute1());
            jsonObject.put("attribute2", keyboard.getAttribute2());
            jsonArray.add(jsonObject);
        }

        try (FileWriter fileWriter = new FileWriter("keyboards.json")) {
            fileWriter.write(jsonArray.toJSONString());
            System.out.println("Data saved to keyboards.json");
        } catch (IOException e) {
        }
    }

    private static void printAllObjects(ArrayList<Keyboard> keyboards) {
        for (Keyboard keyboard : keyboards) {
            System.out.println("ID: " + keyboard.getId());
            System.out.println("Attribute 1: " + keyboard.getAttribute1());
            System.out.println("Attribute 2: " + keyboard.getAttribute2());
            System.out.println();
        }
    }
    }

    
}

