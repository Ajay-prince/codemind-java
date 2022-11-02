import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(2>1){
            int sum=0;
            int re;
            while(n!=0){
                re=n%10;
                sum+=re;
                n=n/10;
            }
            if(sum<10){
                System.out.print(sum);
                break;
            }
            else{
                n=sum;
            }
        }
       }
    }
