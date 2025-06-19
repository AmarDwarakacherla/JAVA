import java.sql.Connection;

public class trash {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManger.getConnection("","","");

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
