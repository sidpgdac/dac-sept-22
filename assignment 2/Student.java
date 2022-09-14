import java.util.Scanner;
class Student
{
public static void main(String args[])
{
	Scanner sc=new Scanner("11 12");
	
	//System.out.println("Enter First Number:-");
	int i=sc.nextInt();
	
	//System.out.println("Enter First Number:-");
	int j=sc.nextInt();
	
	int k=i+j;
	System.out.println("Sum="+k);
}
}