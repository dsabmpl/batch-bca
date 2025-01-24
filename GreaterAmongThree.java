public class GreaterAmongThree {
    public static void main(String[] args) {
        int a = 10020;
        int b = 90;
        int c = 1009;

        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            } else {
                System.out.println("C is Greater");
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("B is Greater");
            } else {
                System.out.println("C is Greater");
            }
        }
    }

}
