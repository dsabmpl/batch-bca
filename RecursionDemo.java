public class RecursionDemo {
    static void printDigits(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printDigits(n - 1);

        System.out.println(n);
    }

    static int printName(int n) {
        // if (n == 0) {
        // return;
        // }
        // System.out.println("Yash");
        // printName(n - 1);
        // System.out.println("XYZ");
        return 10;
    }

    public static void main(String[] args) {
        // 10 times
        printName(5);
        // printDigits(5);
    }
}
