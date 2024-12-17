package JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class jdbc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conn connection = Conn.getInstance(); // Using singleton pattern
        char ch = 'N';
        do{
            System.out.println("\n=== Student Database Menu ===");
            System.out.println("1. Create a Table");
            System.out.println("2. Insert Student Data");
            System.out.println("3. Fetch Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Update Student Data");
            System.out.println("6. Exit");
            System.err.print("Enter your choice: ");
            int n = input.nextInt();input.nextLine();   // To consume newline character after nextInt()
            int id;String name;
            switch(n){
                case 1:
                    System.out.println("Enter the Table Name");
                    String tableName = input.nextLine();
                    createTable(connection, tableName);
                    break;
                case 2:
                    System.err.println("Enter the Id of the Student");
                    id = input.nextInt();input.nextLine();
                    System.err.println("Enter the Name of the Student");
                    name = input.nextLine();
                    insertStudentData(connection, id, name);
                    break;
                case 3:
                    System.err.println("Student Details......");
                    fetchAllStudent(connection);
                    break;
                case 4:
                    System.err.println("Enter the ID to Delete ");
                    id = input.nextInt();input.nextLine();
                    deleteStudent(connection, id);
                    break;
                case 5:
                    System.err.println("Enter the ID to Update ");
                    id = input.nextInt();input.nextLine();
                    System.err.println("Enter the Name to Update ");
                    name = input.nextLine();
                    updateStudent(connection, id, name);
                    break;
                case 6:
                    System.out.println("Do you want to Exit....");
                    System.out.println("Y / N : ");
                    ch = input.next().charAt(0);
                    break;
            }
        }while(ch == 'N');

    }
    public static void createTable(Conn db,String tableName){
        try{
            Statement stmt = db.getConnection().createStatement();
            String checkTable = "SELECT COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'ems' AND TABLE_NAME = '"+tableName+"'";
            ResultSet rs = stmt.executeQuery(checkTable);
            int count = 0;
            while(rs.next()){
                count = rs.getInt(1);
            }
            if(count>0){
                System.out.println("Table '" + tableName + "' already exists.");
            }else{
                String Query = "CREATE TABLE IF NOT EXISTS " + tableName +
                        " (id INT PRIMARY KEY, name VARCHAR(50))";
                stmt.execute(Query);
                System.out.println("Table '" + tableName + "' created successfully.");
            }
        }catch(Exception e){
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
    public static void insertStudentData(Conn db, int id, String name){
        try{
            Statement stmt = db.getConnection().createStatement();
            String Query = "INSERT INTO stu(id, name) VALUES(" + id + ", '" + name + "')";
            int  rowsInserted = stmt.executeUpdate(Query);
            if (rowsInserted > 0) {
                System.out.println("Student data inserted successfully.");
            } else {
                System.out.println("Failed to insert student data.");
            }
        }catch(Exception e){
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }
    public static void fetchAllStudent(Conn db){
        try{
            Statement stmt = db.getConnection().createStatement();
            String Query = "SELECT * FROM stu";
            ResultSet rs = stmt.executeQuery(Query);
            while(rs.next()){
                System.out.println(rs.getInt("id")+" : "+rs.getString("name"));
            }
        }catch (Exception e){
            System.out.println("Error fetching data: " + e.getMessage());
        }
    }
    public static void deleteStudent(Conn db, int id){
        try{
            Statement stmt = db.getConnection().createStatement();
            String Query = "DELETE FROM stu where id = "+id;
            int rowsAffected = stmt.executeUpdate(Query);
            if (rowsAffected > 0) {
                System.out.println("Student data deleted successfully.");
            } else {
                System.out.println("No student found with the given ID.");
            }
        }catch (Exception e){
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }
    public static void updateStudent(Conn db, int id, String studentName){
        try{
            String Query = "UPDATE stu SET name = ? WHERE id = ?";
            PreparedStatement stmt = db.getConnection().prepareStatement(Query);
            stmt.setInt(2, id);
            stmt.setString(1, studentName);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student data updated successfully.");
            } else {
                System.out.println("No student found with the given ID.");
            }
        }catch(Exception e){
            System.out.println("Error updating data: " + e.getMessage());
        }
    }
}
