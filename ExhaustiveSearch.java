public class ExhaustiveSearch {
    public static void search(int n, String result) {
        if (n == result.length()) {
            System.out.println(result);
            return;
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'a' || i == 'o' || i == 'e' || i == 'i' || i == 'u') {
                search(n, result + i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        search(n, "");
    }

}
