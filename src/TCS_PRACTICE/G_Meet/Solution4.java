package TCS_PRACTICE.G_Meet;

import java.util.*;
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        Phone arr[] = new Phone[n];
        for (int i = 0; i < 2; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Phone(a, b, c, d);
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();

        int sum = findPriceForGivenBrand(arr, brand);
        if (sum > 0) {
            System.out.println(sum);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone out = getPhoneIdBasedOnOs(os, arr);
        if (out == null) {
            System.out.println("No phones are available with soecified os and price range");
        } else {
            System.out.println(out.getphoneId());
        }
    }
    public static int findPriceForGivenBrand (Phone[]arr, String brand)
    {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            if (arr[i].getbrand().equals(brand)) {
                sum = sum + arr[i].getprice();
            }
        }
        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }

    }
    public static Phone getPhoneIdBasedOnOs (String os1, Phone arr[])
    {
        Phone temp = null;
        for (int i = 0; i < 2; i++) {
            if (arr[i].getos().equalsIgnoreCase(os1) && arr[i].getprice() >= 50000){
                    return arr[i];
            }
        }
        return temp;
    }
}
class Phone {
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
    public int getphoneId() {
        return phoneId;
    }
    public String getos() {
        return os;
    }
    public String getbrand() {
        return brand;
    }

    public int getprice() {
        return price;
    }
}


