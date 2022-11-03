import java.util.*;
import java.lang.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
            
        }
        int k=(int)n/2;
        for(int j=(n-1);j>=k;j--){
            System.out.print(a[j]+" ");
        }
        for(int u=0;u<k;u++){
            System.out.print(a[u]+" ");
        }
    }
}