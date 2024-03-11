public class Queuell {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int x) {
        Node newNode = new Node(x);
        newNode.data = x;
        newNode.next = null;
        if (front == null && rear == null) {

            front = rear = newNode;

        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void display() {
        Node temp;
        temp = front;
        while (temp != null) {
            System.out.println("the element in queue:" + temp.data);
            temp = temp.next;

        }
    }

    void dequeu() {
        Node temp;
        temp = front;
        if (front == null && rear == null) {
            System.out.println("Linked list is empty");

        } else {  
            System.out.println("The pop element is " + front.data);
            front = front.next;
            temp.next = null; 

        }
    }

    public static void main(String[] args) {

        Queuell o1 = new Queuell();
        o1.enqueue(25);
        o1.enqueue(56);
        o1.display();
        o1.dequeu();
        o1.display();
 
    }

}
