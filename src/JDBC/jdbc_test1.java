package JDBC;
import java.sql.*;
import java.sql.DriverManager;
public class jdbc_test1 {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/ems";
        String User = "root";
        String Password = "";
        Connection conn = DriverManager.getConnection(URL, User, Password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next()){
            System.out.println(rs.getInt("roll_no")+" "+rs.getString("student_name"));
        }
    }
    public void fetchData(String query){

    }

}
