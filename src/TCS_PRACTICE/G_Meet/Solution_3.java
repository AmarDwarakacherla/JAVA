package TCS_PRACTICE.G_Meet;
import java.util.*;

class Employee{
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;
    Employee(int employeeId, String name, String branch, double rating, boolean transport){
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public double getRating(){
        return rating;
    }
    public boolean getTransport(){
        return transport;
    }
}


public class Solution_3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int a = input.nextInt();
            input.nextLine();
            String b = input.nextLine();
            String c = input.nextLine();
            double d = input.nextDouble();input.nextLine();
            boolean e = input.nextBoolean();input.nextLine();
            employees[i] = new Employee(a, b, c, d, e);
        }
        String branch = input.nextLine();
        int res = findCountOfEmployeesUsingCompTransport(employees,branch);
        if(res>0) System.out.println(res);
        else System.out.println("No such Employees");


        Employee emp = findEmployeeWithSecondHighestRating(employees);
        if(emp!=null){
            System.out.println(emp.getEmployeeId());
            System.out.println(emp.getName());
        }
    }
    static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch){
        int count = 0;
        for(int i=0;i<employees.length;i++){
            if(employees[i].getTransport()==true && employees[i].getBranch().equalsIgnoreCase(branch)){
                    count++;
            }
        }
        return count;
    }

    static Employee findEmployeeWithSecondHighestRating(Employee[] employees){
        Employee first = null;
        Employee second = null;
        for(int i=0;i<employees.length;i++){
            if(!employees[i].getTransport()){
                if(first==null || employees[i].getRating()<first.getRating()){
                    second = first;
                    first = employees[i];
                }
                else if(second==null ||first.getRating()<second.getRating()){
                    second = first;
                }
            }
        }


//        ArrayList<Employee> arr = new ArrayList<>();
//        for(int i=0;i<employees.length;i++){
//            if(!employees[i].getTransport()){
//                arr.add(employees[i]);
//            }
//        }
//        Employee[] t = new Employee[arr.size()];
//        for(int i=0;i<arr.size();i++){
//            t[i] = arr.get(i);
//        }
        // need to write bubble sort


        return second;
    }

}
