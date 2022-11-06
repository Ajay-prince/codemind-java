import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      for(int i=0;i<n;i++){
          String str=sc.next();
          String numbers="";
        numbers=str.replaceAll("[^0-9]","");
        if(numbers.length()>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
      }
       
    }
}