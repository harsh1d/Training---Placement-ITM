package day4.task1;

public class task11 {
    
}

class MyStack {

    // array to store elements
    private int[] array;

    // maximum size of stack
    private int capacity;

    // index of top element
    private int top;

    // constructor
    public MyStack(int cap) {
        capacity = cap;
        array = new int[capacity];
        top = -1;
    }

    // push operation
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = x;
    }

    // pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    // peek (or top) operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return array[top];
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
} // end of MyStack

class Main {
    public static void main(String[] args) {
        MyStack st = new MyStack(4);

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        int val = st.pop(); // catch or store the returned value in val
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " +
                (st.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " +
                (st.isFull() ? "Yes" : "No"));
    }
}