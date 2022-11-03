import java.util.*;
import java.lang.*;
class R{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        int pro=1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            pro*=a[i];
        }
        
        for(int i=0;i<n;i++){
            int k=(int)pro/a[i];
            System.out.print(k+" ");
        }
    }
}