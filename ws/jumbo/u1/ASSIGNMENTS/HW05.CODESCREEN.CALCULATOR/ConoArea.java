public public class ConoArea {

    public static void main(String[] args) {

       System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
       System.out.println("BRYAN JUMBO");
       System.out.println("OOP NRC 9642");

       double length = 7;
       double radio = 4; 

       CalculateConoArea(length,radio);
   } 
   public static void CalculateConoArea(double length,double radio ) {
       double Pi = 3.14;
       double solution = Pi * radio * length + Pi * radio * radio;

       System.out.println("The total surface area of ​​the cone is" + solution +"cm^2" );
       
   }
      
}
