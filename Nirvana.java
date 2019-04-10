
import java.util.*;
import java.lang.*;


public class Nirvana {
	
	public static void main (String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		long n=0; long p=1; long d=0; long temp=0;long c=1; long pro=1; long k=0; long max=0; long check=0; long q=0;
		
		n=in.nextInt();
		temp=n;
		while(n>9)
		{
			p=1;
			n=n/10;
			
			q=(n-1);
			
			while(q>0)
		{
			d=q%10;
			q=q/10;
			p=p*d;
						
			
			}
			p=p*(int)Math.pow(9,c);
			
			if(p>check)
				check=p;
			
			c++;		
			
			
			}
		d=n;
		
		if(d==1)
			p=Math.max((int)Math.pow(9,c-1 ), check);
		else
			p=Math.max((d-1)*(int)Math.pow(9,c-1 ), check);	
		n=temp;
		
		for(long i= temp; i>=temp-10; i--)
		{
			pro=1;
			k=i;
			
			while(k>0)
		{
			d=k%10;
			k=k/10;
			pro=pro*d;
						
			
			}
			
		if(pro>max)	
			max=pro;
			
			
		}
		
		
		p=Math.max(p,max);
		
		System.out.println(p);
		
		
		
		
	}
}

