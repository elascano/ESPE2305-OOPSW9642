package utils;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Cellphone implements Serializable{
    
    private int id;
    private int memory;
    private String brand;
    private String color;
    
    public void addCellphone(){
        
        int id;
        int memory;
        String brand;
        String color;
        
        System.out.println("Enter an id");
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                id = scanner.nextInt();
                if(id < 0){
                    System.out.println("Invalid id, try again: ");
                }else{
                    break;
                }
            }catch(Exception e){
                System.out.println("Invalid Data, try again: ");
            }
        }
        
        System.out.println("Enter the memory: ");
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                memory = scanner.nextInt();
                if(memory < 0){
                    System.out.println("Invalid memory, try again: ");
                }else{
                    break;
                }
            }catch(Exception e){
                System.out.println("Invalid Data, try again: ");
            }
        }
        
        System.out.println("Enter the brand: ");
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                brand = scanner.nextLine();                
                break;
            }catch(Exception e){
                System.out.println("Invalid Data, try again: ");
            }
        }
        
        System.out.println("Enter the color: ");
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                color = scanner.nextLine();                
                break;
            }catch(Exception e){
                System.out.println("Invalid Data, try again: ");
            }
        }
        
        this.id = id;
        this.memory = memory;
        this.brand = brand;
        this.color = color;
        
    }
}
