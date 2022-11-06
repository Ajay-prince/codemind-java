import java.util.*;
import java.lang.*;
class Palin{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int flag=-1;
    int flag1=-1;
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int b=sc.nextInt();
    for(int i=0;i<n;i++){
        if(a[i]==b){
            flag=i;
        }
    }
    for(int i=(n-1);i>=0;i--){
        if(a[i]==b){
            flag1=i;
        }
    }
    System.out.printf("%d %d",flag1,flag);
    }
}