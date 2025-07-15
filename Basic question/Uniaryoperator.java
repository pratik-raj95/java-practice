public class Uniaryoperator {
    public static void main(String[] args) {
        int a = 5;
        boolean flag = false;

        System.out.println("Original value of a: " + a);

        // Pre-increment
        System.out.println("++a = " + (++a)); // 6

        // Post-increment
        System.out.println("a++ = " + (a++)); // 6 (then a becomes 7)
        System.out.println("Now a = " + a);   // 7

        // Pre-decrement
        System.out.println("--a = " + (--a)); // 6

        // Post-decrement
        System.out.println("a-- = " + (a--)); // 6 (then a becomes 5)
        System.out.println("Now a = " + a);   // 5

        // Unary minus and plus
        System.out.println("Unary minus -a = " + (-a)); // -5
        System.out.println("Unary plus +a = " + (+a));  // 5

        // Logical NOT
        System.out.println("!flag = " + (!flag)); // true
    }
}
