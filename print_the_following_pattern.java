import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int k=1;
        for(int i=0;i<t;i++){
            for(int j=1;j<=k;j++){
                System.out.print(j);
            }
            k+=1;
            System.out.print("
");
        }
    }
}