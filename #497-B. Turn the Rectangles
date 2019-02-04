import java.util.*;
import java.lang.*;
class turn_the_rectangles

{
      public static void main(String args[])
      {
        int n=0; long s0=0; String res="";int c=0; long next=0; long max,min=0;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
       
        long h[]=new long[n];
        long w[]=new long[n]; 
       
         for(int i=0; i<n; i++)
          {
             
            w[i]=in.nextLong();
            h[i]=in.nextLong();
            
        }
          
        max=Math.max(w[0],h[0]);
        min=Math.min(w[n-1],h[n-1]);
        
        if(max<min)
        c=-2;
        
        
        for(int  j=1; j<n-1; j++)
          {
             if(max>=Math.max(w[j],h[j]))
             next=Math.max(w[j],h[j]);
             else if(max>=Math.min(w[j],h[j]))
             next=Math.min(w[j],h[j]);
             else
             c=-2;
              
             if(next>=Math.max(w[j+1],h[j+1]))
             { 
                max=next;
                next=Math.max(w[j+1],h[j+1]);
                c++;
              }
            
             else if(next>=Math.min(w[j+1],h[j+1]))
             {
                 
                max=next;
                next=Math.min(w[j+1],h[j+1]);
                c++;
              }
             else 
             {
                 c=-2;
                 break;
              }
              
            }
            if(n==1)
            System.out.println("YES");
                
            
            
             if(c==n-2)
             { 
                 System.out.println("YES");
             }
             else if(c==(-2))
             { 
                 System.out.println("NO");
             }
             
           
            
           
        }
    }
            
           
