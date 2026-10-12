public class ArrayInsertion {
    public static void insertAtIndex(int[] arr, int index, int value, int currentSize) {
        // TUMHARA CODE YAHAN LIKHO
        // Step 1: Pehle elements ko right shift karo (end se start karo!)
        for (int i = currentSize; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        // Step 2: Phir index pe naya value daalo
        arr[index] = value;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 0, 0};
        int currentSize = 3;
        insertAtIndex(arr, 2, 25, currentSize);
        
        // Print result
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Expected Output: 10 20 25 30 0
    }
}