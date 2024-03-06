

public class Palindrome {

    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
     System.out.println();
    }
	
	
	public static bool isPalindrome(Node head){
       Node head,tail;
       head.prev=null;
       tail.next=null;
       while(head!=tail){
         if(head.data!=tail.data){
			  
			  return false;
			   
			  head=head.next;
              tail=tail.prev;			  
			 
		 }
		
		 
	   }
	  
         	   
	}
	
	
	
     

    public static void main(String[] args) {
     
        
        Node a =new Node(2);
        Node b =new Node(5);
        Node c =new Node(6);
		Node d =new Node(7);
		Node e =new Node(8);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
		d.prev=c;
		d.next=e;
		e.prev=d;
		e.next=null;

        display(a);
		isPalindrome(a);
		//deleteadindex(a,0);
		//display(a);
		
		//Node newHead=insertatbegin(a,12);
		
		//display(newHead);
		
		deleteadindex(a,2);
		display(a);
		//insertattail(a,15);
		
		//display(a);
		
		//deleteHead(a);
		//display(a);
		//displayrev(c);
		
		//displayrandom(b);
    }
    
}
