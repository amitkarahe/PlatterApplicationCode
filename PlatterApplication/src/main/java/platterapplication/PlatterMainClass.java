package platterapplication;
import java.util.Scanner;
public class PlatterMainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The radius of first dip = ");
        double radius1 = sc.nextDouble();
        System.out.println("The radius of second dip = ");
        double radius2 = sc.nextDouble();
        System.out.println("The radius of third dip = ");
        double radius3 = sc.nextDouble();
        System.out.println("The radius of fourth dip = ");
        double radius4 = sc.nextDouble();
        System.out.println("The radius of fifth dip = ");
        double radius5 = sc.nextDouble();
        
        Hemisphere hemisphere1 = new Hemisphere(radius1);
        Hemisphere hemisphere2 = new Hemisphere(radius2);
        Hemisphere hemisphere3 = new Hemisphere(radius3);
        Hemisphere hemisphere4 = new Hemisphere(radius4);
        Hemisphere hemisphere5 = new Hemisphere(radius5);
          
        Platter platter1 = new Platter(hemisphere1,hemisphere2,hemisphere3,hemisphere4,hemisphere5);
        Platter platter2 = new Platter(hemisphere1,hemisphere2,hemisphere3,hemisphere4,hemisphere5);
        Platter platter3 = new Platter(hemisphere1,hemisphere2,hemisphere3,hemisphere4,hemisphere5);
        Operations operations = new Operations(platter1,platter2,platter3);
        
        System.out.println("The Material required for Idlis is = " + operations.getMaterial());
    }
}
