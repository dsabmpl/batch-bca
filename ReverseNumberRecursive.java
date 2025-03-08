public class ReverseNumberRecursive {
    static void reverse(int num, int rev) {
        // int rev = 0;
        // while (num != 0) {
        // int digit = num % 10;
        // rev = rev * 10 + digit;
        // num /= 10;
        // }

        // return rev;
        if (num == 0) {
            System.out.println("Reverse is " + rev);
            return;
        }

        reverse(num / 10, rev * 10 + num % 10);
    }

    static void palindrome(int num, int rev, int copy) {
        if (num == 0) {
            if (rev == copy) {
                System.out.println("The Number is Palindrome");
            } else {
                System.out.println("The Number is Not Palindrome");
            }
            return;
        }

        palindrome(num / 10, rev * 10 + num % 10, copy);
    }

    public static void main(String[] args) {
        int num = 10001;
        // reverse(num, 0);
        palindrome(num, 0, num);

    }

}
