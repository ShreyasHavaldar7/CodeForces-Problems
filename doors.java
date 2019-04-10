
import java.util.*;
import java.lang.*;

public class doors{
	
	public static void main (String[] args) {
		
		int n=0;int l=0; int r=0;
		Scanner in= new Scanner(System.in);
		n=in.nextInt(); String s="";
		int p[]= new int[n];
		
		for(int i=0; i<n; i++)
          {
             
            p[i]=in.nextInt();
            s=s+p[i];
            
           }
           
           l= s.lastIndexOf('0')+1;
           r= s.lastIndexOf('1')+1;
		
		 System.out.println(Math.min(l,r));
		
	}
}


      
       
         
          
          
        
      
         
                 
        

            
