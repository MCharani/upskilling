import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        int intValue = (int) d;

        System.out.println("Original Double : " + d);
        System.out.println("Converted Int   : " + intValue);

        System.out.print("\nEnter an integer: ");
        int num = sc.nextInt();

        double doubleValue = (double) num;

        System.out.println("Original Integer : " + num);
        System.out.println("Converted Double : " + doubleValue);

        sc.close();
    }
}
