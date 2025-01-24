public class Prime {
    static boolean isPrime(int num) {
        // 7
        // 7 % 1 == 0
        // 7 % 7 == 0
        // from 2 to 6
        // 7 % 2 == 0 false
        // 7 % 3 == 0 false
        // 7 % 4 == 0 false
        // 7 % 5 == 0 false
        // 7 % 6 == 0 false
        // Step 1 : Initialize the variable prime = true
        // Step 2 : Run a Loop from 2 to that number
        // Step 3 : check the number is divisible by the value of i
        // Step3 : if the number divisible make prime = false.
        // Step 4 : if Prime = true return true.
        // Step 5 : if prime = false return false.
        // boolean prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // prime = false;

                // break;
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(isPrime(n) ? "The number is Prime" : "The Number is not Prime");
    }

}
