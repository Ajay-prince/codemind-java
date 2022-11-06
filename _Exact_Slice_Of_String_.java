import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       StringBuffer sb=new StringBuffer(sc.nextLine());
       int n=sc.nextInt();
       int m=sc.nextInt();
       String s=sb.substring(n,m+1);
       System.out.print(s);
       
    }
}