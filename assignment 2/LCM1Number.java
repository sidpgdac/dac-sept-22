//30/18=1 rem 12
//18/12=1 rem 6
//12/6=2 rem 0

60-48=12
48-12=36
36-12=24
24-12=12
12-12=0




import java.util.*;
class LCM1Number
{
	public static void main(String args[])
	{
		
		//int a=30, b=18;
		int p,q;
		
		System.out.println("Enter the Number:");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		p=a;
		q=b;
		
		while(a-b!=0)
					  
		{
			int rem=a-b;
			a=b;
			b=rem;
		}
		int LCM=(p*q/b);
			
		
		System.out.println("LCM is:"+LCM);
	}	
	}	
	