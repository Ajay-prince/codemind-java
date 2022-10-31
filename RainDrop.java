import java.util.*;
import java.lang.*;
class Check{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%3==0 && n%5==0 &&n%7==0){
            System.out.print("PlingPlangPlong");
        }
        else if(n%3==0&&n%5==0&&n%7!=0){
            System.out.print("PlingPlang");
        }
        else if(n%3==0&&n%5!=0&&n%7==0){
            System.out.print("PlingPlong");
        }
        else if(n%3!=0&&n%5==0&&n%7==0){
            System.out.print("PlangPlong");
        }
        else if(n%3==0&&n%5!=0&&n%7!=0){
            System.out.print("Pling");
        }
        else if(n%3!=0&&n%5!=0&&n%7==0){
            System.out.print("Plong");
        }
        else if(n%3!=0&&n%5==0&&n%7!=0){
            System.out.print("Plang");
        }
        else{
            System.out.printf("%d",n);
        }
        
    }
}