public class Doublylinkedlist1 {

    class Node{
        int data;
        Node prev;
        Node next;


        public Node(int data){
            this.data=data;
        }

    }

    Node head,tail=null;

    public void push(int data){

Node newNode=new Node(data);

if (head==null) {
    head=tail=null;
    head.prev=null;
    tail.next=null;
    
}
if (head!=null) {
    head.prev=newNode;
    head=tail;

    head=newNode;
    
}
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        while (current!=null) {
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Doublylinkedlist1 o1=new Doublylinkedlist1();
        o1.push(34);
        o1.push(34);
       

        Doublylinkedlist1 o2=new Doublylinkedlist1();

        o2.display();



    }
    
}
