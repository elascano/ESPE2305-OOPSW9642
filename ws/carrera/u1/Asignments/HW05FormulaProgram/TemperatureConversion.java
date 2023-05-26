public class TemperatureConversion{
	public static void cover(){
	    System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS - ESPE");
	    System.out.println("\t\tName: Pablo Carrera");
	    System.out.println("\t\tNRC: 9642");
	    System.out.println("\t\tSubject: O.O.P ");
	    System.out.println("\t\tAssignment #4: PROGRAM 1- Temperature Conversion");
	    System.out.println("\t\tProfessor: Edison Lascano \n");
	}
	
	public static double convertCelsiusToFarenheit(double celsiusDeg) {
		double farenheitDeg=(celsiusDeg * 9.0/5) + 32;
		return farenheitDeg;
	}
	
	public static double convertCelsiusToKelvin(double celsiusDeg) {
		double kelvinDeg=celsiusDeg + 273.15;
		return kelvinDeg;
	}
	
	public static void main(String args []) {
		cover();
		double degree = 525.7896;
		
		double result1= convertCelsiusToFarenheit(degree);
		
		double result2= convertCelsiusToKelvin(degree);
		
		System.out.println("The "+degree+" Celsius Degrees, equals "+result1+" Farenheit Degrees");
		System.out.println("The "+degree+" Celsius Degrees, equals "+result2+" Kelvin Degrees");
	}
}