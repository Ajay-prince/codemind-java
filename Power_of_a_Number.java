import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        double power=Math.pow(l,r);
        double mod=power%k;
        System.out.printf("%.0f",mod);
        }
    }
