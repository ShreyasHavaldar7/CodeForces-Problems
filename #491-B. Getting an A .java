import java.util.*;
import java.lang.*;
public class getting_an_A
{
       public static void main(String args[])
      {
        int n=0; long l=0; double avg=0.0,s=0.0;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        
        int p[]= new int[n];
      
       
         for(int i=0; i<n; i++)
          {
             
            p[i]=in.nextInt();
            s=s+p[i];
           }
          
          Arrays.sort(p);
        
        for(int  j=0; j<=n; j++)
          {
              avg=s/n;
              if(avg>=4.5)
             {
             l=j;
             break;
             }
             
             s=s+5-p[j];
             
             
             
                 
                
            }
         
                 System.out.println(l);
        
        }
    }
            
           
