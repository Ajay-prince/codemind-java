import java.util.*;
import java.lang.*;
class Compound{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextInt();
        double r=sc.nextInt();
        double t=sc.nextInt();
        
        double compound=Math.pow((1+(r/100)),t);
        double a=p*compound;
        System.out.printf("%.2f",a);
    }
}