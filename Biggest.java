import java.util.*;
class Biggest{

public static void main(String[] args){
   int a,b,c;
   System.out.println("Enter three number to compare which is biggest");
   Scanner input=new Scanner(System.in);
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
   
    if(a>b && a>c){
	System.out.println(a+" is the biggest number");
	
	}
	else if(b>c && b>a){
	
	System.out.println(b+" is the biggest number");
	}
	else{
	
	System.out.println(c+" is the biggest number");
	}


}



}