import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String numbers=str.replaceAll("[^0-9]","");
        int result=Integer.parseInt(numbers);
        int count=0;
        int re;
        while(result!=0){
re=result%10;
count+=re;
result=result/10;

}
System.out.print(count);
    }
}