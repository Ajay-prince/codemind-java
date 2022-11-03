import java.util.*;
import java.lang.*;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        
    }
    }