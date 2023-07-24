
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        var fileName = "chickens.json";
        var fileToLoadName = "chickensLoad.json";
        int id;
        
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        //Using data from Keyboard
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t Chicken Farm Simulator-Jeffrey Manobanda");
        
        int menuOption;
        try {
            do {
                System.out.println("                MENU                 ");
                System.out.println("1.\tAdd a chicken");
                System.out.println("2.\tSearch a chicken");
                System.out.println("3.\tPrint actual chickens");
                System.out.println("4.\tExit\n");
                System.out.print("Select an option: ");

                menuOption = scan.nextInt();

                switch (menuOption) {
                    case 1 -> {
                        chicken = addChicken();
                        System.out.println(chicken);
                        if (chicken != null) {
                            System.out.println(chicken);
                            chickens.add(chicken);
                            
                            Collections.sort(chickens, new Comparator<Chicken>() {
                                @Override
                                public int compare(Chicken c1, Chicken c2) {
                                    return Integer.valueOf(c1.getId()).compareTo(c2.getId());
                                }
                            });
                            System.out.println(chicken);
                            writeJson(chickens, fileName);
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.print(" Enter chicken: ");
                            id = scan.nextInt();
                            searchChicken(fileName,id);
                        } catch (Exception e) {
                            System.out.println(" NO VALID DATA ");
                        }
                    }
                    case 3 -> readFile(fileName);
                    //case 4 -> /loadFile(fileToLoadName);
                    case 4 -> System.out.println("\n Thanks come back soon \n");
                    default -> System.out.println("\n Invalidated optionB \n");
                }
            } while (menuOption != 0);
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("\n NO VALID DATA ");
        }
        
    }

    static Chicken addChicken() {
        Scanner scan = new Scanner(System.in);
        var fileName = "chickens.json";
        
        Chicken newChicken = new Chicken();
        
        int id;
        String name = new String("");
        int age;
        String color = new String("");
        String moltingReadable = new String ("");
        boolean molting=false;
        
        try {
            System.out.print(" Enter chicken id: ");
            id = scan.nextInt();
            System.out.print(" Enter chicken name: ");
            name = scan.next();
            System.out.print(" Enter chicken color: ");
            color = scan.next();
            System.out.print(" Enter chicken age: ");
            age = scan.nextInt();
            System.out.print(" Enter chicken molting (true/false): ");
            moltingReadable = scan.next();
            if ("true".equals(moltingReadable.toLowerCase())) {
                molting = true;
            } else if ("false".equals(moltingReadable.toLowerCase())) {
                molting = false;
            }
            newChicken = new Chicken(id, name, color, age, molting);
            
            printChicken(newChicken);
            
        } catch (Exception e) {
            System.out.println("\n PLEASE ENTER A VALID DATA \n");
            return null;
        }
        return newChicken;
   }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("  Chicken  ");
        System.out.println("chicken id:  \t " + chicken.getId());
        System.out.println("chicken name:  \t--> " + chicken.getName());
        System.out.println("chicken color:  \t--> " + chicken.getColor());
        System.out.println("chicken age:  \t--> " + chicken.getAge());
        System.out.println("chicken molting:  \t--> " + chicken.isIsMolting());
    }
    
    public static void writeJson(ArrayList<Chicken> chickens, String fileName) {
        File file = new File(fileName);
        file.delete();
        
        File fileOverwritten = new File(fileName);
        
        Gson gson = new Gson();
        String dataJson = gson.toJson(chickens);
        
        try {
            //PrintWriter output = new PrintWriter(new FileWriter(file,true));
            FileWriter output = new FileWriter(fileOverwritten);
            output.write(dataJson);
            
            output.close();
            System.out.println("\n\n File has been written! \n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void readFile(String fileName) {
        File file = new File(fileName);
        
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            
            
            System.out.println("\nID\t|NAME\t|COLOR\t|AGE\t|MOLTING\t|");
            
            while (line != null) {
                
                line = lineConstructor(line);
                data = line.split(",");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static String lineConstructor(String line) {
        line = line.replace("[{","");
        line = line.replace("}]","");
        line = line.replace("},{","\n");
        line = line.replace("\"id\":","");
        line = line.replace("\"name\":","");
        line = line.replace("\"color\":","");
        line = line.replace("\"age\":","");
        line = line.replace("\"isMolting\":","");
        line = line.replace("\"","");
        return line;
    }
    
    public static void printLine(String[] data) {        
        //for-each use
        for (String fact : data) {
            if ("true".equals(fact)) {
                fact="True";
            }else if("false".equals(fact)){
                fact="False";
            }
            System.out.print(fact + "\t|");
        }
        System.out.println();
    }
    
    public static void searchChicken(String fileName, int id) {
        File file = new File(fileName);
        String idToCompare = id+"";
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            
            line = lineConstructor(line);
            System.out.println("\nID\t|NAME\t|COLOR\t|AGE\t|MOLTING\t|");
            
            while (line != null) {
                
                data = line.split(",");
                if(idToCompare.equals(data[0])){
                    printLine(data);
                }
                line = input.readLine();
                line = lineConstructor(line);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
