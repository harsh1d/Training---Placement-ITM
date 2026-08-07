// program to create a stack using array 

package day4.task1;


// rule of encapsulation: data members of class should be private and methods should be public
// declare all the members variables with the private key(private modifers)
// rule of encapsulation for protection of data 


public class task1 {
    // array to store elements
    private int[] arr;

    // maximum size of stack
    private int capacity;

    //index of top element 
    private int top;

    //constructor to initialize stack
    public task1(int cap){
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    // constructor can never be private

    void push(int x){
        if (top == capacity-1){
            System.out.println("Stack Overflow");
            return ;
        }
        arr[++top] = x; // initializing the array , stack with new value
    }

    // pop operation to remove an element from the stack
    public int pop(){
        if (top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    //peek(or top) operation to return the top element of the stack
    public int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    //check is empty method 
    public boolean isEmpty(){
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull(){
        return top == capacity-1;
    }

    public class Main{
        public static void main(String[] args) {
            task1 stack = new task1(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            
            // pooping the element 
            int val = stack.pop(); // catch or store the returned value in val
            System.out.println("Popped : "+ stack.pop());

            // checking top element 
            System.out.println("Top element: "+ stack.peek());

            System.out.println("Top element is: " + stack.peek());
            System.out.println("Stack is empty: " + (stack.isEmpty() ? "Yes" : "No"));
            System.out.println("Stack is full: " + (stack.isFull() ? "Yes" : "No"));
            System.out.println("Popped element is: " + stack.pop());
            System.out.println("Top element after pop is: " + stack.peek());
        }
    }
}
