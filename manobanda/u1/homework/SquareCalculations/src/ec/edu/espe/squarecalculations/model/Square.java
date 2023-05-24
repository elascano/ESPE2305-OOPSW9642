
package ec.edu.espe.squarecalculations.model;

/**
 *
 * @author Jeffrey Manobanda, Codecrafters Team, DCCO-ESPE
 */
public class Square {
    private double base;
    private double height;
    private double side;
    
    
    public Square (double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public Square(){
        base=0;
        height=0;
        side=0;
    }
    
    public double perimeter(){
        return (2*(base+side));
    }
    
    public double area(){
        return base*height;
    }
        
    public double getbase(){
        return base;
    }

    public void setbase(double base){
        this.base=base;
    }
    
    public double getheight(){
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }
    
    public double getside(){
        return side;
    }
  
    public void setside(double sideOne){
        this.side=side;
    }
}

