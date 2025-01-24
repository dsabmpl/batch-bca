import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Yash");
        System.out.println("Yash");
        System.out.println("Yash");
        System.out.println("Yash");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        do {

        } while (i < 10);
    }

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
}
