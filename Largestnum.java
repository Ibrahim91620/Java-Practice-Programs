import java.math.BigInteger;

class Largestnum
{
    public static void main(String args[])
        {
			
         
		 String s1,s2,s3;
		 s1=args[0];
		 s2=args[1];
		 s3=args[2];
		 
		 BigInteger num1=new BigInteger(s1);
		 BigInteger num2=new BigInteger(s2);
		 BigInteger num3=new BigInteger(s3);
		      
			  int i=s1.compareTo(s2);
			  int j=s1.compareTo(s3);
			  
                if(i>0 && j>0)
				{
                    System.out.println( num1+"is Largest Number!...");
                }
				 j=s2.compareTo(s3);
				int k=s2.compareTo(s1);
             if(j>0 && k>0)
                {
					
					
					
						System.out.println(num2+"is Largest number!...");
					
						
				}
				else{
					System.out.println( num3+"is Largest number");
				}
        }
}