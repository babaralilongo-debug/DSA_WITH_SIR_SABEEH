// Yeh Node class hai jo har element ko represent karti hai
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListBasics {
    Node head = null; // Shuru mein list bilkul khali hai
    
    // TUMHARA CODE YAHAN LIKHO
    
    public void insertAtHead(int data) {
        // Step 1: Naya node banao (new Node(data))
        Node newNode = new Node(data);
        // Step 2: Is naye node ke 'next' ko current 'head' ki taraf point karwao
        newNode.next = head;
        // Step 3: Ab 'head' ko is naye node pe update kar do
        head = newNode;
    }
    
    public void printList() {
        // Step 1: Ek 'current' pointer banao jo 'head' se start ho
        Node current = head;
        // Step 2: Jab tak 'current' null nahi hota, uska data print karo 
        //         aur 'current' ko 'current.next' pe update karo
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();
        
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);
        
        list.printList(); 
        // Expected Output: 10 -> 20 -> 30 -> null
    }
}

    public void insertAtTail(int data) {
        // Step 1: Naya node banao
        Node newNode = new Node(data);
        
        // Step 2: Edge Case check karo - Agar list bilkul khali hai (head == null), 
        //         toh naye node ko head bana do aur return kar jao.
        if(head == null){
            head = newNode;
            return;
        }
        // Step 3: Agar list khali nahi hai, toh ek 'current' pointer banao jo 'head' se start ho.
        // Step 4: Ek while loop chalao jab tak 'current.next' null na ho jaye. 
        //         (Matlab tumhe wo node chahiye jiska 'next' null ho, wo tumhari Tail hai).
        // Step 5: Jab loop ruk jaye, toh 'current.next' ko 'newNode' ke barabar set kar do.
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }