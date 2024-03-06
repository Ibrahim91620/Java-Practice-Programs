import java.math.BigInteger;
import java.util.Scanner;

class Calculate
{
    public static void main(String args[])
        {
			
         Scanner sc=new Scanner(System.in);
		 String s1,s2;
		
		 
		
		 //BigInteger num3=new BigInteger(n3);
		  System.out.println("Enter the first number");  
         s1=sc.next();
		  System.out.println("Enter the second number");
		 s2=sc.next();
		 
		  BigInteger num1=new BigInteger(s1);
		  BigInteger num2=new BigInteger(s2);
		  BigInteger result;
		 
		 result=num1.add(num2);
		 
	     System.out.println("The sum is"+result);
		 
		 result=num1.subtract(num2);
		 
		  System.out.println("The subtract is"+result);
		
		  result=num1.multiply(num2);
		  System.out.println("the multiplication is "+result);
			  
               
        }
}