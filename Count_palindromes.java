import java.lang.*;
import java.util.*;
class Palin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
        int n1=sc.nextInt();    
        
        int t=n1;
        int rev=0;
        int re;
        while(n1!=0){
            re=n1%10;
            rev=rev*10+re;
            n1=n1/10;
        }
        if(t==rev){
            count++;
            
        }
        }
        System.out.print(count);
    }
}