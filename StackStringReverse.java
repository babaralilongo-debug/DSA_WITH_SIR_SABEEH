public class StackStringReverse {
    
    public static String reverseString(String str) {
        // TUMHARA CODE YAHAN LIKHO
        // Step 1: MyStack ka object banao (size = str.length())
        int size = str.length();
        char[] stack = new char[size];
        int top = -1;
        // Step 2: Ek loop chalao aur String ke har character ko stack mein push karo
        for(int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }
        // Step 3: Ek nayi empty String (ya StringBuilder) banao
        String newString = "";
        // Step 4: Jab tak stack khali na ho, pop karo aur us character ko nayi String mein add karte jao
        while(top >= 0) {
            newString += stack[top--];
        }
        // Step 5: Final reversed String return karo
        return newString;
    }

    public static void main(String[] args) {
        String original = "HELLO";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        // Expected Output: OLLEH
    }
}