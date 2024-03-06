import java.util.*;
class LCM{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
   
  int a=sc.nextInt();
  int b=sc.nextInt();
  int n1=a;
  int n2=b;
  
  while(n1%n2!=0){
  
  int rem=n1%n2;
  
   n1=n2;
   
   n2=rem;
  
  
  
  
  
  
  }


 int gcd=n2;
 
 int lcm=((n1*n2) / gcd);
 
 
 System.out.println(gcd);
 System.out.println(lcm);
 

}




}