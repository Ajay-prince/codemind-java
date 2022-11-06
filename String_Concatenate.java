import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
          String str=sc.next();
          String str1=sc.next();
          String s3=str.concat(str1);
          char charArray[]=s3.toCharArray();
          Arrays.sort(charArray);
          System.out.println(new String(charArray));
       
    }
}