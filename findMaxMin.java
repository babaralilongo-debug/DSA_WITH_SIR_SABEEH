public class findMaxMin {
    
    // Ek simple class banate hain taake hum do values (Max aur Min) ek saath return kar saken
    static class Result {
        int max;
        int min;
        Result(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }

    public static Result findMaxMin(int[] arr) {
        // TUMHARA CODE YAHAN LIKHO
        // Step 1: Pehle max aur min dono ko array ke pehle element (arr[0]) se initialize karo.
        int max = arr[0];
        int min = arr[0];
        // Step 2: Ek loop chalao jo index 1 se start ho kar end tak jaye.
        for(int i =0; i <= arr.length - 1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        // Step 3: Har element ko current max aur min se compare karo aur update karo.
        // Step 4: End mein naya Result(max, min) return karo.
        return new Result(max, min);
    }
    
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 33, 7, 99};
        Result res = findMaxMin(numbers);
        System.out.println("Max: " + res.max + ", Min: " + res.min);
        // Expected Output: Max: 99, Min: 7
    }
}