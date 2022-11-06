import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next();
        String numbers=str.replaceAll("[^0-9]","");
        if(str.length()==numbers.length()){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        System.out.print("
");
        }
        
    }
}