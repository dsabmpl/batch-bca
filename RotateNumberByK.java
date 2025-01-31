public class RotateNumberByK {
    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static int rotate(int num, int k) {
        int digits = countDigit(num);
        k = k % digits;
        int rightPart = num % (int) Math.pow(10, k);
        num = num / (int) Math.pow(10, k);
        rightPart = rightPart * (int) Math.pow(10, digits - k);
        return rightPart + num;

    }

    public static void main(String[] args) {
        int num = 12345;
        int k = 22;
        System.out.println(rotate(num, k));

    }
}