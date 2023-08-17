
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.controller.InputHandler;
import ec.edu.espe.farm.model.*;
import java.util.Date;


/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        InputHandler keyboardInput = new InputHandler();
        displayMainMenu(keyboardInput);
        
    }
    
    public static void displayMainMenu(InputHandler keyboardInput) {
        int menuOption;
        do{
            System.out.println(" FARM SYYSTEM ");
            System.out.println("--------------");
            System.out.println("1. Add animals");
            System.out.println("2. View animals added");
            System.out.println("3. Feed animals");
            System.out.println("4. View production of animals");
            System.out.println("5. Exit");
            menuOption = keyboardInput.nextInt();

            switch (menuOption) {
                case 1:
                    displayAddMenu(keyboardInput);    
                    break;
                case 2:
                    if(JsonFileManager.objectsSaved("Animals")!=null){
                        System.out.println(JsonFileManager.objectsSaved("Animals").toString());
                    }
                    else{
                        System.out.println("There is no info to print");
                    }
                    break;
                case 3:
                    displayFeedMenu(keyboardInput); 
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Exiting the app...");
                    break;
                default:
                    System.out.println("The entered option is not avaliable");
            }
        }while(menuOption!=5);
    }
    
    public static void displayAddMenu(InputHandler keyboardInput) {
        int menuOption;
     
        do{
            System.out.println("What kind of animal do you want to add? ");
            System.out.println("1. Chicken");
            System.out.println("2. Cow");
            System.out.println("3. Duck");
            System.out.println("4. Pig");
            System.out.println("5. Sheep");
            System.out.println("6. Exit");
            menuOption = keyboardInput.nextInt();

            switch (menuOption) {
                case 1:
                    enterChickenInfo(keyboardInput);
                    break;
                case 2:
                    enterCowInfo(keyboardInput);
                    break;
                case 3:
                    enterDuckInfo(keyboardInput);
                    break;
                case 4:
                    enterPigInfo(keyboardInput);
                    break;
                case 5:
                    enterSheepInfo(keyboardInput);
                    break;
                case 6:
                    System.out.println("Going to main menu");
                    break;
                default:
                    System.out.println("The entered option is not avaliable");
            }  
        }while(menuOption!=6);
        
    }
    
    public static void enterChickenInfo(InputHandler keyboardInput) {
        Date bornOn;
        
        Chicken chicken = new Chicken();
        
        chicken.setId(generateId());
        
        System.out.println("Enter the breed");
        chicken.setBreed(keyboardInput.nextLine());

        bornOn = enterBornDate(keyboardInput);
        chicken.setBornOn(bornOn);

        System.out.println("Enter the weight in kg");
        chicken.setWeight(keyboardInput.nextFloat());

        chicken.setIsMolting(enterBirdStatus(keyboardInput));
        
        chicken.setLaidEggs(0);

        JsonFileManager.write(chicken, "Animals");
    }
    
    public static void enterCowInfo(InputHandler keyboardInput) {
        Date bornOn;
        
        Cow cow = new Cow();
        
        cow.setId(generateId());
        
        System.out.println("Enter the breed");
        cow.setBreed(keyboardInput.nextLine());

        bornOn = enterBornDate(keyboardInput);
        cow.setBornOn(bornOn);

        System.out.println("Enter the weight in kg");
        cow.setWeight(keyboardInput.nextFloat());

        cow.setIsProducingMilk(enterCowStatus(keyboardInput));

        JsonFileManager.write(cow, "Animals");
    }
    
    public static boolean enterCowStatus(InputHandler keyboardInput) {
        String isMolting;
        boolean moltingState;
        do{
            System.out.println("Is the cow producing milk? (Y/N)");
            isMolting = keyboardInput.nextLine();
            switch (isMolting) {
                case "Y":
                    moltingState = true;
                    break;
                case "N":
                    moltingState = false;
                    break;
                default:
                    moltingState = false;
                    System.out.println("Please enter the response with Y or N, no more characters");
                    break;
            } 
       }while(!"Y".equals(isMolting) && !"N".equals(isMolting));
       return moltingState;
    }
    
    public static void enterDuckInfo(InputHandler keyboardInput) {
        Date bornOn;
        
        Duck duck = new Duck();
        
        duck.setId(generateId());
        
        System.out.println("Enter the breed");
        duck.setBreed(keyboardInput.nextLine());

        bornOn = enterBornDate(keyboardInput);
        duck.setBornOn(bornOn);

        System.out.println("Enter the weight in kg");
        duck.setWeight(keyboardInput.nextFloat());

        duck.setIsMolting(enterBirdStatus(keyboardInput));
        
        duck.setLaidEggs(0);
        
        JsonFileManager.write(duck, "Animals");
    }
    
    public static void enterPigInfo(InputHandler keyboardInput) {
        Date bornOn;
        
        Pig pig = new Pig();
        
        pig.setId(generateId());
        
        System.out.println("Enter the breed");
        pig.setBreed(keyboardInput.nextLine());

        bornOn = enterBornDate(keyboardInput);
        pig.setBornOn(bornOn);

        System.out.println("Enter the weight in kg");
        pig.setWeight(keyboardInput.nextFloat());

        pig.setInitialWeight(pig.getWeight());
        
        JsonFileManager.write(pig, "Animals");
    }
    
    public static void enterSheepInfo(InputHandler keyboardInput) {
        Date bornOn;
        Date lastSheer;
        
        Sheep sheep = new Sheep();
        
        sheep.setId(generateId());
        
        System.out.println("Enter the breed");
        sheep.setBreed(keyboardInput.nextLine());

        bornOn = enterBornDate(keyboardInput);
        sheep.setBornOn(bornOn);

        System.out.println("Enter the weight in kg");
        sheep.setWeight(keyboardInput.nextFloat());
        
        lastSheer = enterLastSheerDate(keyboardInput);
        sheep.setLastSheerDate(lastSheer);
        
        JsonFileManager.write(sheep, "Animals");
    }
    
    public static Date enterLastSheerDate(InputHandler keyboardInput) {
        Date lastSheer = new Date();
        System.out.println("Enter the last sheer year");
        lastSheer.setYear(keyboardInput.nextInt());
        System.out.println("Enter the last sheer month");
        lastSheer.setMonth(keyboardInput.nextInt());
        System.out.println("Enter the last sheer day");
        
        return lastSheer;
    }
    
    public static boolean enterBirdStatus(InputHandler keyboardInput) {
        String isMolting;
        boolean moltingState;
        do{
            System.out.println("Is the bird molting? (Y/N)");
            isMolting = keyboardInput.nextLine();
            switch (isMolting) {
                case "Y":
                    moltingState = true;
                    break;
                case "N":
                    moltingState = false;
                    break;
                default:
                    moltingState = false;
                    System.out.println("Please enter the response with Y or N, no more characters");
                    break;
            } 
       }while(!"Y".equals(isMolting) && !"N".equals(isMolting));
       return moltingState;
    }
    
    public static Date enterBornDate(InputHandler keyboardInput) {
        Date bornOn = new Date();
        System.out.println("Enter the born year");
        bornOn.setYear(keyboardInput.nextInt());
        System.out.println("Enter the born month");
        bornOn.setMonth(keyboardInput.nextInt());
        System.out.println("Enter the born day");
        bornOn.setDate(keyboardInput.nextInt());
        
        return bornOn;
    }
    
    public static int generateId() {
        int id;
        if(JsonFileManager.objectsSaved("Animals")==null){
            id = 1;
        }
        else{
            id = JsonFileManager.objectsSaved("Animals").size()+1;
        }
        return id;
    }
    
    
    
    public static void displayFeedMenu(InputHandler keyboardInput) {
        int menuOption;
        FarmAnimal farmAnimal;
        Food food = new Food();
        
        System.out.println("Enter the food quantity in grames you are gonna give");
        
        food.setWeightInGrames(keyboardInput.nextFloat());
        
        do{ 
            System.out.println("What kind of animal do you want to feed? ");
            System.out.println("1. Chicken");
            System.out.println("2. Cow");
            System.out.println("3. Duck");
            System.out.println("4. Pig");
            System.out.println("5. Sheep");
            System.out.println("6. Exit");
            menuOption = keyboardInput.nextInt();

            switch (menuOption) {
                case 1:
                    farmAnimal = new Chicken();
                    System.out.println("Weight before feed: " + farmAnimal.getWeight());
                    farmAnimal.feed(food);
                    System.out.println("Weight after feed: " + farmAnimal.getWeight());
                    
                    break;
                case 2:
                    farmAnimal = new Cow();
                    System.out.println("Weight before feed: " + farmAnimal.getWeight());
                    farmAnimal.feed(food);
                    System.out.println("Weight after feed: " + farmAnimal.getWeight());
                    break;
                case 3:
                    farmAnimal = new Duck();
                    System.out.println("Weight before feed: " + farmAnimal.getWeight());
                    farmAnimal.feed(food);
                    System.out.println("Weight after feed: " + farmAnimal.getWeight());
                    break;
                case 4:
                    farmAnimal = new Pig();
                    System.out.println("Weight before feed: " + farmAnimal.getWeight());
                    farmAnimal.feed(food);
                    System.out.println("Weight after feed: " + farmAnimal.getWeight());
                    break;
                case 5:
                    farmAnimal = new Sheep();
                    System.out.println("Weight before feed: " + farmAnimal.getWeight());
                    farmAnimal.feed(food);
                    System.out.println("Weight after feed: " + farmAnimal.getWeight());
                    break;
                case 6:
                    System.out.println("Going to main menu");
                    break;
                default:
                    System.out.println("The entered option is not avaliable");
            }
        }while(menuOption!=6);
    }
    
    
    
    
}
