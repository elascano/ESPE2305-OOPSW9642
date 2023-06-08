import java.util.Scanner;

public class CubeVolumeCalculator{
	public static void main(String args[]){

		double sideLength = enterSideLength();
		double volume = calculateCubeVolume(sideLength);
		
		System.out.println("The Volume of the cube is:" +volume);

	}

	public static double enterSideLength(){
		Scanner scanner = new Scanner(System.in);
        double sideLength;
        do{
            System.out.print("Enter the length of the side of the cube: ");
            sideLength = scanner.nextDouble();
            validatePositive(sideLength);
        }while(sideLength <= 0);
        return sideLength;
	}
	
    public static void validatePositive(double number){
        if(number <= 0){
            System.out.println("Warning! The length of the cube cannot be equal to or less than 0.");
        }
    }

	public static double calculateCubeVolume(double sideLength){
		double volume = Math.pow(sideLength, 3);
		return volume;
	}
}