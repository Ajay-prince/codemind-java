import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
        int re;
         while(n!=0){
                re=n%10;
                sum+=re;
                pro*=re;
                n=n/10;
            }
        int subtract=(int)(pro-sum);
        System.out.print(subtract);
            
        }
       }
    