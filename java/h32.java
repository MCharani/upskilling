import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class h32 {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "root";

            Connection con =
                    DriverManager.getConnection(url, user, password);

            PreparedStatement insert =
                    con.prepareStatement(
                            "INSERT INTO students VALUES(?,?)");

            insert.setInt(1, 101);
            insert.setString(2, "Charani");

            insert.executeUpdate();

            PreparedStatement update =
                    con.prepareStatement(
                            "UPDATE students SET name=? WHERE id=?");

            update.setString(1, "Charan");
            update.setInt(2, 101);

            update.executeUpdate();

            System.out.println("Insert and Update Successful");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}