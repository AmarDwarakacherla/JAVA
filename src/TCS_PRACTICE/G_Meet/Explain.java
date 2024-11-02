package TCS_PRACTICE.G_Meet;
class sample{
    private int id;
    private String name;
    sample(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name = name;
    }

}
public class Explain {
    public static void main(String[] args) {
        sample s1 = new sample(10,"Amar");
//        System.out.println(s1.getName());
        System.out.println(s1.getName() + " "+ s1.getId());
        s1.setName("Eswar");
        System.out.println(s1.getName() + " "+ s1.getId());
    }
}
