import java.util.*;
import java.lang.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int re;
        int rev=0;
        while(n!=0){
            re=n%10;
            rev=rev*10+re;
            n=n/10;
        }
        if(t==rev){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
    }
    }