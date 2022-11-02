import java.util.*;
import java.lang.*;
class Neon{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr=n*n;
        int sum=0;
        int re;
        while(sqr!=0){
            re=sqr%10;
            sum+=re;
            sqr=sqr/10;
        }
        if(sum==n){
            System.out.print("Neon Number");
        }
        else{
            System.out.print("Not Neon Number");
        }
    }
}