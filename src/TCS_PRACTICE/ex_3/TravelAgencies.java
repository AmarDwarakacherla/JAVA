package TCS_PRACTICE.ex_3;

public class TravelAgencies {
    private int regNo, price;
    private String agencyName, pakageType;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.price = price;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.flightFacility = flightFacility;
    }

    @Override
    public String toString() {
        return "TravelAgencies{" +
                "regNo=" + regNo +
                ", price=" + price +
                ", agencyName='" + agencyName + '\'' +
                ", pakageType='" + pakageType + '\'' +
                ", flightFacility=" + flightFacility +
                '}';
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPakageType() {
        return pakageType;
    }

    public void setPakageType(String pakageType) {
        this.pakageType = pakageType;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

}
