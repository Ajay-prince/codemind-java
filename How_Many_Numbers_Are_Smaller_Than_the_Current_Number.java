import java.util.*;
import java.lang.*;
class Palin{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int flag=0;
    
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        
    }

    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(a[i]>a[j]){
                count++;
            }
           
        }
         System.out.print(count+" ");
    }
    
    }
    }