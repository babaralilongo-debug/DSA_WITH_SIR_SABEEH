public class MyStack {
    int[] arr = new int[5];
    int top = -1; // Shuru mein stack khali hai
    
    // TUMHARA CODE YAHAN LIKHO
    
    public void push(int value) {
        // Check overflow, phir top badhao aur value daalo
        if(top >= arr.length - 1) {
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr[top] = value;
            System.out.println("Pushed: " + value);
        }
    }
    
    public int pop() {
        // Check underflow, phir value lo aur top ghatao
        if(top < 0) {
            System.out.println("Stack Underflow");
            return -1; // Ya koi aur error value return kar sakte ho
        }
        else{
            int poppedValue = arr[top];
            top--;
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
    }
    
    public int peek() {
        // Check empty, phir sirf top ki value return karo
        if(top < 0) {
            System.out.println("Stack is empty");
            return -1; // Ya koi aur error value return kar sakte ho
        }
        else{
            return arr[top];
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Peek: " + stack.peek()); // Expected: 30
        System.out.println("Pop: " + stack.pop());   // Expected: 30
        System.out.println("Peek: " + stack.peek()); // Expected: 20
        
        stack.pop();
        stack.pop();
        stack.pop(); // Yeh "Stack Underflow" print karega
    }
}