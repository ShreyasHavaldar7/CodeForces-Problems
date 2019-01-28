import java.util.*;
import java.lang.*;
public class worldcup

{
      public static void main(String args[])
      {
        int n=0;  int pos=0; long min=0; double x=0.0;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
       
        long p[]=new long[n];
        long d[]=new long[n];
        
       
         for(int i=0; i<n; i++)
          {
             
            p[i]=in.nextLong();
           
            
            
        }
          
           
          
            for(int i = 0;i < n;i ++) 
            {
        if(p[i] - i >= 0) p[i] = p[i] - i;
        else p[i] = 0;
        }
    
             for(int i = 0;i < n;i ++) {
       x = ((double)p[i]) / n;
        d[i] = (long)Math.ceil(x);
    }
     min = d[0];
    
    for(int i = 1;i < n;i ++) 
    {
        if(d[i] < min) {
            min = d[i];
            pos = i;
        }
    }
                
                
                
                 System.out.println(pos+1);
  
       }
        
        
                
             
    }

            
           