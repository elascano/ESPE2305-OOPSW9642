import java.util.Scanner;

public class SphereVolumeCalculation {

	public static void main (String args[]) {
		Scanner keyboardInput = new Scanner(System.in);
		double sphereRadius;
		double sphereVolume;

		do{
			System.out.println("Please enter the sphere radius");
			sphereRadius = keyboardInput.nextDouble();

			if(sphereRadius < 0 ){
				System.out.println("Negative radius doesn't exist");	
			}
		} while(sphereRadius < 0);

		sphereVolume = calculateSphereVolume(sphereRadius);
		System.out.println("The sphere volume is: " + sphereVolume + " u^3");
	}


	public static double calculateSphereVolume(double radius) {
		double PI = 3.14159265;
		double volume = (4*PI*(raiseToIntPower(radius, 3)))/3;
		return volume;
	}

	public static double raiseToIntPower(double base, int exponent) {
		double powerResult = 1;
		if(exponent == 0){
			return powerResult;
		}
		else {
			for (int i = 0; i < exponent; i++){
				powerResult = powerResult * base ; 
			}
		}
		return powerResult;
	}
}