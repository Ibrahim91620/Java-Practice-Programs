public class Stack {
   int top=-1;
   int n=10;
   int[] stack=new int[n];

   void push(int n){
    if (top==n-1) {
        System.out.println("Overflow"); 
    }
    else{
        top++;
        stack[top]=n;

    }
}

    void pop(){
        int item; 
        if (top==-1) {
           System.out.println("underflow condition"); 
        }else{
            item=stack[top];
            top--;

            System.out.println("The pop element is "+item);


        }
    }
        void peek(){
            System.out.println("The peek element is "+stack[top]);

        }

        void display(){
            if (top==-1) {
               System.out.println("underflow ");
            }
            else{
               for(int i=top; i>=0; i--){
                System.out.println("The element in the stack is "+stack[i]);
               }
            }


        }

        public static void main(String[] args) {
            Stack s=new Stack();
            s.push(60);
            s.push(69);
            s.display();
            s.pop();
            s.display();
        }
    }
   

   


