import java.util.*;
import java.lang.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int max=-100;
        int re;
        
        while(n1!=0){
            re=n1%10;
            if(re>max){
                max=re;
            }
            n1=n1/10;
        }
        System.out.print(max);
    }
    }