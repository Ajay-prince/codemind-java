import java.lang.*;
import java.util.*;
class Ksum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]==m){
                flag+=i;
                break;
            }
        }
        int sum=0;
        for(int j=0;j<=flag;j++){
            sum+=a[j];
        }
        System.out.print(sum);
    }
}