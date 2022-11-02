import java.util.*;
import java.lang.*;
class Simple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextInt();
        double t=sc.nextInt();
        double r=sc.nextInt();
        double s=(p*t*r)/100;
        int k=(int)s;
        System.out.printf("%d",k);
    }
}