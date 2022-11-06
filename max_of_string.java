import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
          
          String s3=sc.nextLine();
          char charArray[]=s3.toCharArray();
          Arrays.sort(charArray);
          for(int i=(charArray.length-1);i>=0;i++){
              System.out.print(charArray[i]);
              break;
          }
       
    }
}