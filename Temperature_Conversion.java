import java.lang.*;
import java.util.Scanner;
class Temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double  t=sc.nextInt();
        double faren=32+((t*9)/5);
        System.out.printf("%.2f",faren);
    }
}