import java.util.*;
import java.lang.*;
class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}