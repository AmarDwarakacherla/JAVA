package TCS_PRACTICE.ex_4;

public class FootWear {
    private int footwearId;
    private String footwearName, footwearType;
    private int price;

    FootWear(int footwearId, String footwearName, String footwearType,int price)
    {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "FootWear{" +
                "footwearId=" + footwearId +
                ", footwearName='" + footwearName + '\'' +
                ", footwearType='" + footwearType + '\'' +
                ", price=" + price +
                '}';
    }

    public int getFootwearId() {
        return footwearId;
    }
    public int getPrice(){
        return price;
    }
    public String getFootwearName(){
        return footwearName;
    }
    public String getFootwearType(){
        return footwearType;
    }

}
