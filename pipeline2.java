import java.util.*;
import java.lang.*;
public class pipeline2
{
        
   public static void main(String args[])
     { 
        long s,n,k,no=-1;
        Scanner in= new Scanner(System.in);
        
        n=in.nextLong();
        k=in.nextLong();
 int c=0;long lb=2;long ub=k;long m=0;long sum=0;
 while(lb<ub)
 {
 m=(long)(Math.ceil(((double)(ub+lb))/2.0));
 sum= (k*k+k-m*m+m)/2 + m -k;

 if(sum<n)
 {
 ub=m-1;

 }
 else if(sum>=n)
 {
 lb=m;
 }
 }
 
 if(((k*k+k-ub*ub+ub)/2 + ub -k)<n)
 no=-1;
 
 else
 no=k-ub+1;
 
 
 if(n==1)
 no=0;

 System.out.println(no);

        
 }
    
            
}      