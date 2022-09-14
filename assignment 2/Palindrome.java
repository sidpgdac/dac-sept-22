import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int rev=0,rmd,original;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int no=sc.nextInt();
		original=no;
		
		while(no!=0)
		{
			rmd = no % 10;
        rev = rev * 10 + rmd;
        no /= 10;
		}
		
		if(original==rev)
		
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}	
			