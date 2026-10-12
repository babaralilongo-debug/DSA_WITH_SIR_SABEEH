public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        // TUMHARA CODE YAHAN LIKHO
        // Hint: Do pointers use karo (ek start pe, ek end pe)
        int start = 0; // Start pointer
        int end = arr.length - 1; // End pointer
        int temp = 0;
        // aur unko aapas mein swap karte hue beech ki taraf lao.
        while(end > start){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        
        // Print result
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Expected Output: 5 4 3 2 1
    }
}