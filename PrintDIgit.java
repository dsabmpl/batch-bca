public class PrintDIgit {
    // num = 12345
    // 1 2 3 4 5
    static void show(int num){
        if(num ==0){
            return ;
        }
        show(num/10);
        // Stack Fall
        System.out.println(num % 10);
    }
    public static void main(String[] args) {
        show(12345);
    }
}
