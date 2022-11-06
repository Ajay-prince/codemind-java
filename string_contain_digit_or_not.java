import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
          String str=sc.next();
          String numbers="";
        numbers=str.replaceAll("[^0-9]","");
        if(numbers.length()>0){
            System.out.println("Contains "+numbers.length()+" digit");
        }
        else{
            System.out.println("Doesn't contain digit");
        }
      
       
    }
}