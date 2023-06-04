
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.time.LocalDate;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class ChickenFarm {
    Chicken chickens[];
    
    public static void main(String[] args) {
        int select;
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop = null;
        Coop coop2;
        System.out.println("Adonny Clero´s Farm ");
        System.out.println("chickens size --> " + chickens.size());
        
         select = 0;
         	while(select != 3){
		try{
                    System.out.println("Choose an option:\n1.-Enter Chicken" +
					"\n2.- Save JSON\n" +
					"3.- Salir\n");
                    Scanner scanner = new Scanner(System.in);
                                
                    select = Integer.parseInt(scanner.nextLine()); 
                    switch(select){
			case 1 -> {
                            chicken = new Chicken();
                            Scanner scannerChicken = new Scanner(System.in);
                            System.out.println("Please enter the ID of the chicken:");
                            chicken.setId(scannerChicken.nextInt());
                            System.out.println("Please enter the name of the Chicken: ");
                            chicken.setName(scanner.nextLine());
                            System.out.println("Please enter the color of the Chicken:");
                            chicken.setColor(scanner.nextLine());
                            System.out.println("The chicken is molting?(Enter True or False): ");
                            chicken.setIsMolting(scanner.nextBoolean());
                            System.out.println("Please enter the Year on born of the chicken:  ");
                            int yearOfBorn = scanner.nextInt();
                            System.out.println("Please enter the Month on born of the chicken:  ");
                            int monthOfBorn = scanner.nextInt();
                            System.out.println("Please enter the Day on born of the chicken:  ");
                            int dayOfBorn = scanner.nextInt();
                            chicken.setBornOnDate(LocalDate.of(yearOfBorn, monthOfBorn, dayOfBorn));
                            chicken.setAge(chicken.getAge(LocalDate.of(yearOfBorn, monthOfBorn, dayOfBorn)));
                            chickens.add( chicken);
                            coop = new Coop(1, chickens);
                            }
				case 2 -> {
                                    Gson gson = new GsonBuilder()
                                            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                                            .create();
                                    String json = gson.toJson(coop);
                                    System.out.println(json);
                                }
				default -> System.out.println("Número no reconocido");
				}
				
				System.out.println("\n");
				
                    }catch(Exception e){
                            System.out.println("Uoop! Error!");
			}
		}
    }
    private static class LocalDateAdapter implements JsonSerializer<LocalDate> {
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        @Override
        public JsonElement serialize(LocalDate date, Type typeOfSrc, JsonSerializationContext context) {
            String formattedDate = date.format(FORMATTER);
            return new JsonPrimitive(formattedDate);
        }
    }
}
