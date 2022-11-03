import java.util.*;
import java.lang.*;
class R{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=k;j<n;j++){
            System.out.print(a[j]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}