import java.util.*;
import java.lang.*;
class Last{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                k=a[i];
            }
        }
        
        System.out.print(k);
    }
}