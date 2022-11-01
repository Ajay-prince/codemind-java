import java.lang.*;
import java.util.*;
class Palin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        int re;
        while(n!=0){
            re=n%10;
            rev=rev*10+re;
            n=n/10;
        }
        if(t==rev){
            System.out.print(2);
            
        }
        else{
            System.out.print(1);
        }
    }
}