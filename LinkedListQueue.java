public class LinkedListQueue {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node front, rear;
    private int size;

    public boolean isEmpty() { return front == null; }
    public int size()        { return size; }
 
    // Enqueue: rear pe naya node
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue: front se node remove
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        System.out.println("Dequeued: " + value);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front -> rear): ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        System.out.println("Front element: " + q.peek());
        System.out.println("Size: " + q.size());
        q.dequeue();
        q.dequeue();
        q.dequeue();            // underflow
    }
}
