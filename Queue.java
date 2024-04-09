class Queue{
    int n=10;
    int [] queue=new int [n];
    int front=-1, rear=-1;
    void enqueue(int n){
        if (rear==n-1)  {
            System.out.println("Queue is overflow");
        }
        else if(rear==-1 && front==-1 ){
        
            front=rear=0;
            queue[rear]=n;

        }else{
            rear++;
            queue[rear]=n;
        }
    
    }

    void dequeue(){
    if(front==-1 || rear==-1){
        System.out.println("underflow");
        return;
    }
    else{
        int t=queue[front];
        front++;
       
       
       return;
    }
    }
    void display(){
        if (rear==-1 && front==-1) {

            System.out.println("Queue is empty");
            
        }
        else {
            for(int i=front; i<=rear; i++){
                System.out.println("The element in queue: "+queue[i]);
            }
        }
    }

    public static void main(String[] args) {

        Queue o1=new Queue();
        o1.enqueue(12);
        o1.enqueue(15);
        o1.enqueue(15);
       
       
        o1.display();
        o1.dequeue();
        o1.display();


        
    }
   

}