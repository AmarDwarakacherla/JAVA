package Bot.Akka;

public class Employee {
    private int user_id;
    private String user_name;
    private String time;

    public Employee(int user_id, String user_name, String time) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.time = time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
