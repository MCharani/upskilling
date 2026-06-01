import java.util.HashMap;
import java.util.Scanner;

public class h25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();

        System.out.println("Student Name: " + students.get(searchId));

        sc.close();
    }
}