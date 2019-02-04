import java.util.*;
import java.lang.*;

public class marlin
{
   
   public static void main(String args[])
   {
       
       int n=0,k=0;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        k=in.nextInt();
        
        char r1[]=new char[n];
        char r2[]=new char[n];
        char r3[]=new char[n];
        char r4[]=new char[n];
        
        for(int i=0; i<n; i++)
        {
            r1[i]='.';r2[i]='.';r3[i]='.';r4[i]='.';
        }
        
        if(k%2==0)
        {
            for(int i=1; i<(k/2)+1; i++)
        {
            r2[i]='#';r3[i]='#';
        }
        System.out.println("YES");
        for(int i=0; i<n; i++)
        {
            System.out.print(r1[i]);
           
        }
        System.out.println();
         for(int i=0; i<n; i++)
        {
            System.out.print(r2[i]);
           
        }
        System.out.println();
        
         for(int i=0; i<n; i++)
        {
            System.out.print(r3[i]);
           
        }
        System.out.println();
        
         for(int i=0; i<n; i++)
        {
            System.out.print(r4[i]);
           
        }
        System.out.println();
            
            
        }
        
        else if((k%2!=0)&&(k<=n-2))
        {
            for(int i=0; i<=(k-1)/2; i++)
        {
            r2[(n-1)/2 +i]='#';
            r2[(n-1)/2 -i]='#';
            
        }
        System.out.println("YES");
        for(int i=0; i<n; i++)
        {
            System.out.print(r1[i]);
           
        }
        System.out.println();
         for(int i=0; i<n; i++)
        {
            System.out.print(r2[i]);
           
        }
        System.out.println();
        
         for(int i=0; i<n; i++)
        {
            System.out.print(r3[i]);
           
        }
        System.out.println();
        
         for(int i=0; i<n; i++)
        {
            System.out.print(r4[i]);
           
        }
        System.out.println();
            
        }
        else if((k%2!=0)&&(k>n-2)&&(k>4))
        {
            
            
            for(int i=1; i<=(k+1)/2; i++)
            r2[i]='#';
            
            for(int i=1; i<=(k+1)/2; i++)
            r3[i]='#';
            
            r2[(k+1)/2 -1]='.';
            
            System.out.println("YES");
        for(int i=0; i<n; i++)
        {
            System.out.print(r1[i]);
           
        }
        System.out.println();
         for(int i=0; i<n; i++)
        {
            System.out.print(r2[i]);
           
        }
        System.out.println();
        
         for(int i=0; i<n; i++)
        {
            System.out.print(r3[i]);
           
        }
        System.out.println();
        
         for(int i=0; i<n; i++)
        {
            System.out.print(r4[i]);
           
        }
        System.out.println();
            
            
        }
        
        
        else
        System.out.println("NO");
       
       
   }
}
