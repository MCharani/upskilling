public class h12 {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 10 and 20 = " + add(10, 20));
        System.out.println("Sum of 5.5 and 4.5 = " + add(5.5, 4.5));
        System.out.println("Sum of 1,2,3 = " + add(1, 2, 3));
    }
}