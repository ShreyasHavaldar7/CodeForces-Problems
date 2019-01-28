import java.util.*;
import java.lang.*;
public class vanya_and_lanterns
{
       public static void main(String args[])
      {
        int n=0; long l=0; double max=0.0,d=0.0;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        l=in.nextLong();
        double p[]= new double[n];
      
       
         for(int i=0; i<n; i++)
          {
             
            p[i]=in.nextDouble();
            
            }
          
          Arrays.sort(p);
        
       
        max=Math.max((p[0]-0),(l-p[n-1]));
        
        for(int  j=0; j<n-1; j++)
          {
               
              d=((p[j+1]-p[j])/2);
              if(d>max)
              max=d;
                 
                
            }
            
              
           
             
                 System.out.println(max);
             
             
                 
             
           
            
           
        }
    }
            
           