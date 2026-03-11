public class Main {
    public static void main(String[] args) {
        System.out.println("Student Manager жұмыс істеп тұр!");
        greet("Ali");

        int result = sum(5, 3);
        System.out.println("5 + 3 = " + result);
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}