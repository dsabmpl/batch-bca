public class Table {
    static void printTable(int num, int mul) {
        if (mul > 10) {
            return;
        }
        System.out.println(num + "*" + mul + "=" + (num * mul));
        printTable(num, mul + 1);
    }

    public static void main(String[] args) {
        printTable(5, 1);
    }
}
