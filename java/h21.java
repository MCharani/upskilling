import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class h21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Eligible to vote.");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}