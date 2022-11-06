import java.util.*;
import java.lang.*;
class Palin{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int flag=0;
    
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        int t=a[i];
        int count=0;
        int re;
        while(t!=0){
            re=t%10;
            count++;
            t=t/10;
        }
        if(count%2==0){
            flag++;
        }
    }        
    System.out.print(flag);
    }
    }