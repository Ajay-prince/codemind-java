import java.util.*;
import java.lang.*;
class Mixed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            int pro=1;
            for(int j=1;j<=k;j++){
                pro=pro*j;
            }
            System.out.print(pro+"
");
        }
    }
}