public class SimpleQueue {
    int[] arr = new int[5];
    int front = -1; // Shuru mein queue khali hai
    int rear = -1;  // Shuru mein queue khali hai
    
    // TUMHARA CODE YAHAN LIKHO
    
    public void enqueue(int value) {
        // Check full, phir rear badhao aur value daalo
        if(rear == 4){
            System.out.println("Queue is already full.");
        }
        else{
            if(front == -1) {
                front = 0; // Pehli baar element add hone par front ko 0 karna hoga
            }
            rear++;
            arr[rear] = value;
            System.out.println("Enqued : " + value);
        }
        // Note: Pehli baar element add hone par front ko bhi 0 karna hoga!
    }
    
    public int dequeue() {
        // Check empty, phir value lo aur front badhao
        if(front == -1){
            System.out.println("Queue is empty.");
            return 0;
        }
        else{
            int poped = arr[front];
            front--;
            return poped;
        }
    }
    
    public int peek() {
        // Check empty, phir sirf front ki value return karo
        if(front == -1){
            System.out.println("Queue is empty.");
            return 0;
        }
        else{
            return arr[front];
        }
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Peek: " + queue.peek()); // Expected: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 10
        System.out.println("Peek: " + queue.peek()); // Expected: 20
    }
}