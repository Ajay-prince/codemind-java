import java.util.*;
import java.lang.*;
class Elements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        
        int count=0;
        for(int u=0;u<n;u++){
            if(a[u]==b){
                count++;
            }
            
        }
        
            System.out.print(count);
        
    }
}