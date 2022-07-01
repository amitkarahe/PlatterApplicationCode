package platterapplication;
//import java.util.Scanner;
public class Hemisphere {
    private double radius;
    public Hemisphere(double radius){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("The radius of dip = ");
//        radius = sc.nextDouble();        
        this.radius = radius;
    }
    public double getVolume(){
        return (2*3.14*radius*radius*radius)/3;
    } 
}
