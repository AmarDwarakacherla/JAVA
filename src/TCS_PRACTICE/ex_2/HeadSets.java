package TCS_PRACTICE.ex_2;

public class HeadSets {
    private String headsetName, brand;
    private int price;
    private boolean available;

    @Override
    public String toString() {
        return "HeadSets{" +
                "headsetName='" + headsetName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getHeadsetName() {
        return headsetName;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
