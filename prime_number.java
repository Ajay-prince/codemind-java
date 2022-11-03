import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        boolean flag=false;
        double sqr=Math.sqrt(n1)+1;
        int k=(int)sqr;
        for(int i=2;i<k;i++){
            if(n1%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.print("prime");
        }
        else{
            System.out.print("not a prime");
        }
    }
    }
