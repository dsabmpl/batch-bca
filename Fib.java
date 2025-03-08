public class Fib {
    static int fib(int num) {
        if (num < 2) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        // int num = 5;
        int num = 12345;
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int swappedNum = lastDigit * (int) Math.pow(10, (int) Math.log10(num))
                + (num % (int) Math.pow(10, (int) Math.log10(num))) + firstDigit;
        System.out.println(swappedNum);

    }

}
