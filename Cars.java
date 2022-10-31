import java.util.*;
import java.lang.*;
class Division{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        if (n1>n2){
            System.out.print(-1);
        }
        else{
             for(int i=1;i<=19;i++){
                 if ((n2*i)>(x+n1*i)){
                     System.out.printf("%d",i);
                     break;
                 }
             }
            }
        }
    }