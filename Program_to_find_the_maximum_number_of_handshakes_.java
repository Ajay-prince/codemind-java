import java.util.*;
import java.lang.*;
class Hand{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int hand=a*(a-1)/2;
        System.out.printf("%d",hand);
    }
}