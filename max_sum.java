import java.util.*;
import java.lang.*;
public class max_sum
{
        
   public static void main(String args[])
     { 
        long s1, s2=0; long k=0; long n=0; int c=0; long sum=0;
        
        Scanner in= new Scanner(System.in);
        
        n=in.nextLong();
        k=n;
        
 
 while(k>=1)
 {
     c++;
     k=k/10;
      
 }
 
 for(int i =0; i<c-1; i++)
 {
     s2= s2 *10 + 9;
    
    }
    
    s1=n-s2;
    
    while(s1>=1)
 {
     sum = sum + (s1%10);
     s1=s1/10;
    
 } 
    while(s2>=1)
 {
     sum = sum + (s2%10);
     s2=s2/10;
    
 }
    
    
    
    
 
 System.out.println(sum);
    
            
}      
}