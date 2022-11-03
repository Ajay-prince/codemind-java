import java.util.*;
import java.lang.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
    }
}