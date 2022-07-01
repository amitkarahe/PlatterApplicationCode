
package platterapplication;
import java.util.Scanner;
public class Platter {
    private Hemisphere hemisphere1 ;
    private Hemisphere hemisphere2 ;
    private Hemisphere hemisphere3 ;
    private Hemisphere hemisphere4 ;
    private Hemisphere hemisphere5 ;
        
    public Platter(Hemisphere hemisphere1, Hemisphere hemisphere2, Hemisphere hemisphere3, Hemisphere hemisphere4,Hemisphere hemisphere5){
            this.hemisphere1 = hemisphere1;
            this.hemisphere2 = hemisphere2;
            this.hemisphere3 = hemisphere3;
            this.hemisphere4 = hemisphere4;
            this.hemisphere5 = hemisphere5;
   }
    
//    public Platter(Hemisphere hemisphere1){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of hemisphere = ");
//        int temp = sc.nextInt();
//        for(int i = 1; i <=temp ; i++){
//            this.hemisphere1 = hemisphere1;
//        }
//    
//    }
    
    public double plate(){
        return hemisphere1.getVolume()+hemisphere2.getVolume()+hemisphere3.getVolume()+hemisphere4.getVolume()+hemisphere5.getVolume();
//        return hemisphere1.getVolume(hemisphere1);
    }
        
}
