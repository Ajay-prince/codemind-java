import java.util.*;
import java.lang.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int re;
        int rev=0;
        while(n1!=0){
            re=n1%10;
            rev=rev*10+re;
            n1=n1/10;
        }
        System.out.print(rev);
    }
    }
