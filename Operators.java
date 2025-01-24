public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // + , - , * , / , % , ++ , --
        int a = 10;
        int b = 2;
        int c = 89;
        boolean s = true;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(1 / 2);
        System.out.println(a % b);

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        // Comparision Operators
        // > , < , >= , <= , == , !=

        // Logical Operators
        // && , || , !

        // if (a > b && a > c) {
        // System.out.println("A is Greater");
        // } else if (b > a && b > c) {
        // System.out.println("B is Greater");
        // } else {
        // System.out.println(" C is Greater");
        // }

        System.out.println(a > b && b > c);
        System.out.println(a > b || b > c && a > c);
        System.out.println(!!s);

        // Assignment Operators
        // = , += , -= , *= , /= , %=

        a += 2; // a = a + 2
        a *= 2; // a= a* 2;
        a %= 2; // a = a% 2;

        // Bitwise Operators

        // & , | , ~ , ^ ,<< , >>
        a = 10;
        b = 2;

        System.out.println(a & b);
        // 1010
        // 0010
        // 0010
        System.out.println(a | b);
        System.out.println(10 << 1);
        System.out.println(a >> 1);
        System.out.println(a > b ? "A is Greater than B" : "B is Greater than A");
    }

}
