public class FlipDigitWithPosition {

    public static int flip(int num) {
        int pos = 1;
        int ans = 0;
        while (num > 0) {
            int last = num % 10;
            ans += pos * (int) Math.pow(10, last - 1);
            num /= 10;
            pos++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int num = 21435;
        System.out.println(flip(num));

    }

}
