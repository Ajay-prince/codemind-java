import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        for(int i=0;i<t;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            n-=1;
            System.out.print("
");
        }
    }
}