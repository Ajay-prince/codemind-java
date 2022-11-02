import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        int pro=1;
    
        int re;
         while(n!=0){
                re=n%10;
                for(int j=1;j<=re;j++){
                    pro*=j;
                }
                sum+=pro;
                pro=1;
                n=n/10;
            }
            
        if(sum==t){
            System.out.printf("The number %d is a strong number",t);
        }
        else{
            System.out.printf("The number %d is not a strong number",t);
        }
        }
       }
    