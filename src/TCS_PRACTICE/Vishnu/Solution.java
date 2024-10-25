package TCS_PRACTICE.Vishnu;

import java.util.Arrays;
import java.util.Scanner;

//Question:
//Create a class Resort with the below attributes:
//resortld- int resortName - String category - String price- double rating - double
class Resort{
    private int resortld;
    private String resortName, category;
    private double price, rating;

    public Resort(int resortld, String resortName, String category, double price, double rating) {
        this.resortld = resortld;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }
    public int getResortld() {
        return resortld;
    }
    public String getResortName() {
        return resortName;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Resort{" +
                "resortld=" + resortld +
                ", resortName='" + resortName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

//The above attributes should be private, write getters, setters and parameterized constructor as required.
//        Create class Solution with main method.
//Implement a static method - findAvgPriceByCategory in Solution class.

//findAvgPriceByCategory method:
//This method will take two input parameters - array of Resort objects and String parameter.

//The method will return the average price of Resort(as int value) from array of Resort objects for the given category(String parameter passed) and whose rating is greater than 4.

//If no Resort with the above condition is present in the array of Resort objects, then the method should return 0
//Note: All the searches should be case insensitive.
//The above mentioned static method should be called from the main method.
//For findAvgPriceByCategory method - The main method should print the returned average price of Resort as it is, if the returned value is greater than 0 otherwise it should print "There are no such available resort"
//Eg: Average price of the 3 Star Resort: 9250
//where 9250 is the average price and 3 Star is the category.

//1005
//Samudra
//3 star
//3500.00
//        3.5
//        1001
//O by Tamara
//5 Star
//7500.00
//        4
//        1007
//Edens resort
//3 Star
//2500.00
//        4.7
//        1003
//Tea Valley
//3 Star
//4600.00
//        4.3
//        3 Star

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resort[] resorts = new Resort[4];
        for(int i=0;i<4;i++){
            int resortId = input.nextInt();input.nextLine();
            String resortName = input.nextLine();;
            String category = input.nextLine();
            double price = input.nextDouble();input.nextLine();
            double rating = input.nextDouble();input.nextLine();
            resorts[i] = new  Resort(resortId, resortName, category,price,rating);
        }
        String parameter = input.nextLine();
        int res = findAvgPriceByCategory(resorts, parameter);
//        System.out.println(Arrays.toString(resorts));
        if(res>0) System.out.println("Avg: "+res);
        else System.out.println("None");

    }
    public static int findAvgPriceByCategory(Resort[] resorts, String parameter){
        int avg = 0;
        int c = 0;
        int sum = 0;

        for(int i=0;i< resorts.length;i++){
            if(resorts[i].getCategory().equalsIgnoreCase(parameter) && resorts[i].getRating()>4){
                sum += resorts[i].getPrice();
                c++;
            }
        }
        if(c>0){
            avg = sum/c;
        }

        return avg;
    }
}



