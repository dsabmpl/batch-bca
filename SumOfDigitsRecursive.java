public class SumOfDigitsRecursive {
    static void sod(int num, int sum) {
        if (num == 0) {
            System.out.println("The sum is " + sum);
            return;
        }

        int lastDigit = num % 10;
        sod(num / 10, sum + lastDigit);
    }

    static int sod(int num) {
        if (num == 0)
            return 0;
        int sum = sod(num / 10);
        int lastDigit = num % 10;
        return sum + lastDigit;

    }

    public static void main(String[] args) {
        int num = 12345;
        // sod(num, 0);
        System.out.println(sod(num));
    }

}
