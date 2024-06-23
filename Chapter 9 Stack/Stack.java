// Generic Way to implement Stack
public class Stack<T> {
    // now replace int with T[] for stack keyword
    public T[] stack;
    public int top;
    public int capacity;

    @SuppressWarnings("unchecked")
    Stack(int size) {
        stack = (T[]) new Object[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public T push(T value) {
        if (isFull())
            throw new IllegalStateException("Stack overFlow");

        stack[++top] = value;
        return value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[--top];
    }

    public int size() {
        return top + 1;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    @SuppressWarnings("unchecked")
    Stack<T> size(int size) {
        stack = (T[]) new Object[capacity];
        capacity = size;
        top = -1;
        return this;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(5);
        st.push(1);
        st.push(2);
        st.push(6);
        System.out.print("Peek is ");
        System.out.println(st.peek());

        System.out.print("size is ");
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

        System.out.println("\n\non String Stacks ");
        Stack<String> str = new Stack<>(5);
        str.push("(");
        str.push(")");
        //System.out.println(str.peek());
    }
}
