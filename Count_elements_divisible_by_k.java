import java.lang.*;
import java.util.*;
class Divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            if(n1%k==0){
                count++;
            }
        }
        System.out.print(count);
        
    }
}