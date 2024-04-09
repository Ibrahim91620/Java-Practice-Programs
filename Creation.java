

public class Creation {

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
	 public static void displayrev(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.prev;
            
        }
     System.out.println();
    }
	
	public static Node insertatbegin(Node head,int x){
		
		Node newNode= new Node(x);
		newNode.next=head;
		newNode.prev=null;
	
		head=newNode;
		
		return head;
		
	}
	
	public static int deleteHead(Node head){
		Node p=head;
		
		head=head.next;
		head.prev=null;
		
		return p.data;
		
	}
	public static void insertattail(Node head,int x){
		
		Node temp=head;
		while(temp.next!=null){
			
			temp=temp.next;
		
	}
	Node t= new Node(x);
	temp.next=t;
	t.prev=temp;
	}
	
	public static void deleteadindex(Node head,int pos)
	{
		Node temp=head;
		
		for(int i=0; i<pos; i++){

              temp=temp.next;			
		
	}
	   temp.next=temp.next.next;
	   temp.next.prev=temp;
	   
	
	}	
	 public static void displayrandom(Node random){
        Node temp=random;
        while (temp.prev!=null) {
            
            temp=temp.prev;
            
        }
		
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
     System.out.println();
		
		
	 }
     

    public static void main(String[] args) {
        //2 10 5 6
         
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
		
		// deleteadindex(a,0);
		// display(a);
		
		Node newHead=insertatbegin(a,12);
		
		display(newHead);
		
		
		insertattail(a,15);
		
		display(a);

		deleteadindex(a,2);
		display(a);
		deleteHead(a);
		display(a);
		displayrev(e);
		
		//displayrandom(b);
    }
    
}
