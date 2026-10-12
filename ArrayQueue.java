public class ArrayQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
 
    public boolean isEmpty() { return size == 0; }
    public boolean isFull()  { return size == capacity; }
    public int size()        { return size; }

    // Enqueue: rear pe element add (circular)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue: front se element remove
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + value);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front -> rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);          // overflow
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(60);          // circular wrap
        q.display();
        System.out.println("Front element: " + q.peek());
        System.out.println("Size: " + q.size());
    }
}
