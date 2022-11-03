import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        
        double sqr=Math.sqrt(n1);
        int k=(int)sqr;
        if(k*k==n1){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
    }
