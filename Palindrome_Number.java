import java.util.*;
import java.lang.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
        int n=sc.nextInt();
        int t=n;
        int sqr=Math.abs(n);
        int re;
        int rev=0;
        while(sqr!=0){
            re=sqr%10;
            rev=rev*10+re;
            sqr=sqr/10;
        }
        if(t==rev){
            System.out.print("True"+"
");
        }
        else{
            System.out.print("False"+"
");
        }
    }
    }
}