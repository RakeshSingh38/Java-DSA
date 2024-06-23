public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public int push(int value) {
        if (isFull())
            throw new IllegalStateException("Stack overFlow");

        stack[++top] = value;
        return value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        //int rv = ;
        // fix      dont make it stack[--top] , this wont print the last value if u loop through the stack
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    //public int top() {
    //    return stack[top];
    //}

    public void printStack() {
        for (int i = 0; i < stack.length; i++) {
            int value = peek();
            System.out.println("| " + value + " |");
            pop();
        }
        //System.out.println();
    }
    // or

    public void printStack2() {
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[top--] + " |");
            //pop();
        }
        //System.out.println();
    }

    public static void main(String[] args) {
        var st = new StackArray(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(8);
        st.push(8);
        //System.out.print("Peek is ");
        //System.out.println(st.peek());

        //System.out.print("size is ");
        //System.out.println(st.size());

        System.out.println("stack is loading.......");
        st.printStack();

        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

        //if (st.peek() == st.peek())  System.out.println("peeked");
        //String str = "Rakesh";
        //System.out.println(str.substring(1, 4 + 1));
    }
}
