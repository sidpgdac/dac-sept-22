import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		int no,rev=0,digit;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		while(no!=0)
		{
			digit=no%10;
			rev=rev*10+digit;
			no=no/10;
		}
			System.out.println(rev);
	}
}	
		