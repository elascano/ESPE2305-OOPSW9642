package espe.edu.ec.model;

/**
 *
 * @author Andres Espin, The javas, DCOO-ESPE
 */
public class Triangle {
    private double base;
    private double height;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private Double area;
    private Double perimeter;
    
    public Triangle(double base, double height, double sideOne,double sideTwo, double sideThree){
        this.base=base;
        this.height=height;
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;
    }
    
    public double calculateArea(){
        return 0.5*base*height;
    }
    
    public double calculatePerimeter(){
        return sideOne+sideTwo+sideThree;
    }
    
    public double getBase(){
        return this.base;
    }
    public double getHeight(){
        return this.height;
    }
    public double getSideOne(){
        return this.sideOne;
    }
    public double getSideTwo(){
        return this.sideTwo;
    }
    public double getSideThree(){
        return this.sideThree;
    }
            
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setSideOne(double sideOne){
        this.sideOne=sideOne;
    }
    public void setSideTwo(double sideTwo){
        this.sideTwo=sideTwo;
    }
    public void setSideThree(double sideThree){
        this.sideThree=sideThree;
    }
    
    public void setArea(double area){
        this.area=area;
    }
    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
       
    public double getArea(){
        if (this.area == null) {
            this.area = calculateArea();
        }
        return this.area;
    }
    
    public double getPerimeter(){
        if (this.perimeter == null) {
            this.perimeter = calculatePerimeter();
        }
        return this.perimeter;
    }
}