public class ArrayDeletion {
    public static void deleteAtIndex(int[] arr, int index, int currentSize) {
        // TUMHARA CODE YAHAN LIKHO
        // Step 1: Elements ko left shift karo (deleted index se start karke end tak)
        for(int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // Step 2: Last valid position pe 0 daal do (optional but good practice)
        arr[currentSize - 1] = 0; // Assuming 0 is the default value for empty slots
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int currentSize = 5;
        deleteAtIndex(arr, 2, currentSize);
        
        // Print result
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Expected Output: 10 20 40 50 0
    }
}