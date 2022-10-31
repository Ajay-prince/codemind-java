import java.util.*;
import java.lang.*;
class Car{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            double x1=sc.nextInt();
            double x2=sc.nextInt();
            double y1=sc.nextInt();
            double y2=sc.nextInt();
            double car1=y1/x1;
            double car2=y2/x2;
            if (car1<car2){
                System.out.print(-1+"
");
            }
            else if(car1==car2){
                System.out.print(0+"
");
            }
            else{
                System.out.print(1+"
");
            }
        }
    }
}