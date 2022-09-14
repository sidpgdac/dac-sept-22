import java.util.*;
class GCDNumber
{
	public static void main(String args[])
	{
		
		//int a=30, b=18;
		
		System.out.println("Enter the Number:");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		while(a%b!=0)
		{
			int rem=a%b;
			a=b;
			b=rem;
		}
		System.out.println(b);
	}	
	}	