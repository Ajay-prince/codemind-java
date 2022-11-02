import java.util.*;
import java.lang.*;
class Elements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int min=1000;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]<min){
                min=a[i];
            }
            
        }
        System.out.print(min);
        }
}