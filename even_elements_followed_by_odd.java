import java.lang.*;
import java.util.*;
class Ksum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                even[i]=a[i];
            }
            else{
                odd[i]=a[i];
            }
        }
        
        for(int i=0;i<even.length;i++){
            if(even[i]!=0){
                System.out.print(even[i]+" ");
            }
            
        }
        for(int i=0;i<odd.length;i++){
            if(odd[i]!=0){
                System.out.print(odd[i]+" ");
            }
            
        }
        
        
        }
}