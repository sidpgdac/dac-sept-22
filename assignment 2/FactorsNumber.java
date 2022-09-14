import java.util.*;
class FactorsNumber
{
	public static void main(String args[])
	{
		int n,i=1;
		
		System.out.println("Enter the Number:");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}		
	}	
}	