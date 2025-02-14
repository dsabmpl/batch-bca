public class PrintPower {
    static void power(int num, int pow, int result) {
        // base case
        if (pow == 0) {
            System.out.println(result);
            return;
        }

        // pre logic or post logic or both
        // small problem
        power(num, pow - 1, result * num);
    }

    public static void main(String[] args) {
        power(2, 5, 1);
    }
}
