public class SwapFirstAndLast {
    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static int swap(int num) {
        int digits = countDigit(num);
        int lastDigit = num % 10;
        int firstDigit = num / (int) Math.pow(10, digits - 1);
        num /= 10;
        int remaining = num % (int) Math.pow(10, digits - 2);
        int number = lastDigit * (int) Math.pow(10, digits - 2);
        number += remaining;
        return number * 10 + firstDigit;

    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(swap(num));

    }

}
