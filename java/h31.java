import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class h31 {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "root";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}