import java.util.*;
class armstrong
{
 public static void main(String[] args) 
  { 
        
         Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the number : ");
		int number =sc.nextInt();
		int originalNumber, remainder, result = 0;
        int cnt=0,n=number;
		 while(n>0)
         {
			 cnt++;
			 n = n/10;
		 }			 
                

	   originalNumber = number;
    
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder,cnt );
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
