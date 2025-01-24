import java.util.Scanner;

public class SOD {
    static int sumOfDigits(int num) {
        // Step 1: Inilize the Sum Variable with 0
        // Step 2: take last digit of number by doing mudulus by 10.
        // Step 3: Add that remainder to the sum.
        // Step 4: Break the number or divide that number 10
        // Step 5: Repeat From step 2 to step 4 until the number become 0.
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder; // sum = sum + remainder
            num = num / 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        // int n = 12345;
        // n % 10
        // sum = 0 -> 5 ->
        // n / 10
        // 1 + 2 + 3 + 4 + 5 = 15
        // 123 = 1 + 2 + 3 = 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        // System.out.println(n);
        // sc.nextLine();
        // String s = sc.nextLine();
        // System.out.println(s);

    }

}
