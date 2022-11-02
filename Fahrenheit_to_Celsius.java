import java.util.*;
import java.lang.*;
class Celsius{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double f=sc.nextDouble();
        double celsius=(f-32)*5/9;
        System.out.printf("%.2f",celsius);
    }
}