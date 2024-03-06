public class Doublylinkedlist {

    class Node{
        int data;
        Node prev;
        Node next;


        public Node(int data){
            this.data=data;
        }

    }

    Node head=null;

    public void push(int data){

Node newNode=new Node(data);
newNode.next=head;
newNode.prev=null;
if (head!=null) {
    head.prev=newNode;


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
        Doublylinkedlist o1=new Doublylinkedlist();
        o1.push(34);
       

        Doublylinkedlist o2=new Doublylinkedlist();

        o2.display();



    }
    
}
