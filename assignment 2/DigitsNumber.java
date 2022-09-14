import java.util.*;
class DigitsNumber
{
	public static void main(String args[])
	{
		int n1,n2,n3,n4,m1,m2,m3;
			
			
			System.out.println("Enter the Number:");
			Scanner sc=new Scanner(System.in);
			
			
			int i=sc.nextInt();
			
			n1=i/1000;
			m1=i%1000;
			n2=m1/100;
			m2=m1%100;
			n3=m2/10;
			m3=m2%10;
			n4=m3;
			
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);

			}
}	
