public class ArraySum {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int result = calculateSum(numbers);
        System.out.println("Sum: " + result);
    }
}