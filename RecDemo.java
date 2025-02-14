class RecDemo {

    static void show(int n) {
        // base case
        if (n == 0) {
            return; // exit from the function call
        }
        // Pre Logic (Stack Building)
        System.out.println("Amit " + n);
        // n-1 small problem e.g 5-1 = 4
        show(n - 1);
        // Post Logic (Stack Fall)
        System.out.println("Srivastava " + n);
    }

    public static void main(String[] args) {
        show(5);
    }
}