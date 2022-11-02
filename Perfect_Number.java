import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int sum=0;
        for(int i=1;i<l;i++){
            if(l%i==0){
                sum+=i;
            }
           
        }
        if(sum==l){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
        }
    }
