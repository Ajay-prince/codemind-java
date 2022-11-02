import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        int re;
        while(n!=0){
            re=n%10;
        
            if(re%2==0 && re!=0){
                even++;
            }
            else{
                odd++;
            }
            n=n/10;
        }
        if(even!=0 && odd==0){
            System.out.print("Even");
        }
        else if(odd!=0 && even==0){
            System.out.print("Odd");
        }
        else{
            System.out.print("Mixed");
        }
    }
}