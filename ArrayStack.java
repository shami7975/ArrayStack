package arraystack;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push element onto stack
    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        stack[++top] = item;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());       // 30
        System.out.println("Top after pop: " + stack.peek()); // 20
    }
}
