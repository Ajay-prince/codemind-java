import java.util.*;
import java.lang.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr=Math.abs(n);
        int re;
        int rev=0;
        while(sqr!=0){
            re=sqr%10;
            rev=rev*10+re;
            sqr=sqr/10;
        }
        if(n<0){
            System.out.print(rev-(2*rev));
        }
        else{
            System.out.print(rev);
        }
    }
}