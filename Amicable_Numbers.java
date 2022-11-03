import java.util.*;
import java.lang.*;
class Amicable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n=sc.nextInt();
        int sum1=0;
        int sum=0;
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                sum1+=i;
            }
        }
        for(int j=1;j<n;j++){
            if(n%j==0){
                sum+=j;
            }
        }
        if(sum1==n && sum==n1){
            System.out.print("Amicable");
        }
        else{
            System.out.print("Not Amicable");
        }
    }
    }
