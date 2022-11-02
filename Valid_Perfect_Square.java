import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        
        for(int i=0;i<l;i++){
            int n=sc.nextInt();
            double sqr1=Math.sqrt(n);
            int sqr=(int)sqr1;
            
            if(sqr*sqr==n){
                System.out.print("True"+"
");
            }
            else{
            System.out.print("False"+"
");
        }
        }
       
        
        }
    }
