public class CountDigit {
    public static void evenOddSum(int num) {
        // num = 12345
        // pos = 0
        // evenSum = 0
        // oddSUm = 0
        int evenSum = 0, oddSum = 0;
        int position = 1;
        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            num /= 10;
            position++;
        }

        System.out.println("Even sum is :" + evenSum);
        System.out.println("Odd sum is : " + oddSum);

    }

    public static void main(String[] args) {
        int n = 12345;
        evenOddSum(n);
    }

}
