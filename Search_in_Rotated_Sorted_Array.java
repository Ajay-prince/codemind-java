import java.util.*;
import java.lang.*;
class R{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=-1;
        for(int i=0;i<n;i++){
            if(k==a[i]){
                count=i;
            }
        }
        System.out.print(count);
    }
}