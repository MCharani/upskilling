
import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Multiplication Table");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i +
                    " = " + (number * i));
        }

        sc.close();
    }
}