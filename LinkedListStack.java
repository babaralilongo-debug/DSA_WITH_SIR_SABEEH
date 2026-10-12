public class LinkedListStack {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node top;
    private int size;

    public boolean isEmpty() { return top == null; }
    public int size()        { return size; }
 
    // Push: head pe naya node
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed: " + value);
    }

    // Pop: head se node remove
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        System.out.println("Popped: " + value);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        s.pop();
        s.pop();
        s.display();
        System.out.println("Top element: " + s.peek());
        System.out.println("Size: " + s.size());
        s.pop();
        s.pop();
        s.pop();                // underflow
    }
}
