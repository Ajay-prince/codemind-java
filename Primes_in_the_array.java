import java.util.*;
import java.lang.*;
class Prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int count=0;

for(int i=0;i<n;i++){
if (a[i]>1){
boolean flag=false;
double k=Math.sqrt(a[i])+1;
int value=(int)k;
for(int j=2;j<=value;j++){
if(a[i]%j==0 && a[i]!=2){
flag=true;
break;
}
}
if(!flag){
    
count++;
} 
}
}

System.out.print(count);
}
}
