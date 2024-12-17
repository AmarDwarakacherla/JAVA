package JDBC;
import java.sql.*;
public class Conn {
    private static Conn instance;
    private Connection connection;
    String url = "jdbc:mysql://localhost:3306/ems", username = "root", password = "";
    Conn(){
        try{
            //Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establishing connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connection Established");
        }catch (Exception e){
            throw new RuntimeException("Error initializing database connection", e);
        }
    }
    public static Conn getInstance(){
        if(instance == null){
            instance =  new Conn();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
    public void closeConnection(){
        try{
            if(connection != null){
                connection.close();
                System.out.println("Database Connection Closed");
            }
        }catch (Exception e){
            throw new RuntimeException("Error closing database connection", e);
        }
    }
}
