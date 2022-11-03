import java.util.*;
import java.lang.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n-1;
        String alpha[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int i=(n-1);i>=0;i--){
            for(int j=t;j>=0;--j){
                System.out.print(alpha[i]+" ");
            }
            System.out.print("
");
            t-=1;
            
        }
    }
}