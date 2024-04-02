package newpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassLoadingAndConnectivity {

    public static Connection con;

    public static void loadAndConnect() throws ClassNotFoundException, SQLException {
        // load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
     //   System.out.println(c.getName());
        // make a connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment", "root",
                "AnIkEsH@2606");

        if (con.isClosed()) {
            System.out.println("connection Haven't Created");

        } else {

          //  System.out.println("connection Created");
        }
    }
}
