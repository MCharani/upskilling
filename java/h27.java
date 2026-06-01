import java.util.ArrayList;
import java.util.Collections;

public class h27 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Charani");
        names.add("Ravi");
        names.add("Anu");
        names.add("Kiran");

        Collections.sort(names,
                (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}