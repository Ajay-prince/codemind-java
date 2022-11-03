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
            double sqr=Math.sqrt(a[i]);
            int k=(int)sqr;
            if(k*k==a[i]){
                count+=a[i];
            }
        }
        System.out.print(count);
    }
}