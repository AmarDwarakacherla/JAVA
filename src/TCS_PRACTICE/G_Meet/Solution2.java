package TCS_PRACTICE.G_Meet;
import java.util.*;
//
//Create a class newspaper with below attributes.
//    regNo-int
//    name-String
//    publicationYear-int
//    price-int
//    Write parametrised constructor as required.
class Newspaper{
    private int regNo;
    private String Name;
    private int publicationYear;
    private int price;

    Newspaper(int regNo,String Name,int publicationYear, int price){
        this.regNo = regNo;
        this.Name = Name;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    public int getRegNo(){
        return regNo;
    }
    public String getName(){
        return Name;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public int getPrice(){
        return price;
    }
}
//
//
//
//
//    Create class Solution with main method.
//    Implement 2 static methods findTotalPriceByPublicationYear and
//    searchNewspaperByName in solution class.
//
//
//    findTotalPriceByPublicationYear method:
//       This method will take array of the Newspaper objects and int parameter
//    type.This method will return the total price of newspapers from array of
//    Newspaper objects,If the publication year attribute matches with the int
//    parameter passed .If no Newspaper with the given publication year is present
//    in the array ,then the method should return 0.
//    The main method should print total price if the returned value is greater
//    than 0.Else it should print "No Newspaper found with the mentioned attribute".


//    searchNewspaperByName method :
//       This method will take the array of the Newspaper objects and the String
//    parameter type.This method will return the Newspaper object from the Array
//    of Newspaper objects,If the name attribute matches with the string
//    parameter passed.
//    If no Newspaper with the given name is present in the array ,then the
//    method should return null.
//    The main method should print the regNo,name,year of publication,and price
//    if the returned Newspaper object is not null.
//    else it should print "No Newspaper found with the given name.
//    The above mentioned static methods should be called from main method.
public class Solution2 {
    public static void main(String[] args) {
        Newspaper[] newspapers = new Newspaper[4];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<4;i++){

            int a = input.nextInt();input.nextLine();
            String b = input.nextLine();
            int c = input.nextInt();
            int d = input.nextInt();
            newspapers[i] = new Newspaper(a, b, c, d);
        }
        int year = input.nextInt();input.nextLine();
        String Name = input.nextLine();
        int result = findTotalPriceByPublicationYear(newspapers, year);
        if(result !=0){
            System.out.println(result);
        }
        else{
            System.out.println("None");
        }
        Newspaper news = searchNewspaperByName(newspapers,Name);
        if(news!=null){
            System.out.println("RegNo: "+news.getRegNo()+"\nName: "+news.getName()+"\nyear: "+news.getPublicationYear()+"\nPrice: "+news.getPrice());
        }
        else{
            System.out.println("Not Found");
        }

    }
    static int findTotalPriceByPublicationYear(Newspaper[] newspapers,int year){
        int sum = 0;
        for(int i=0;i< newspapers.length;i++){
            if(newspapers[i].getPublicationYear()==year){
                sum += newspapers[i].getPrice();
            }
        }
        return sum;
    }
    static Newspaper searchNewspaperByName(Newspaper[] newspapers, String Name){
        for(int i=0;i< newspapers.length;i++){
            if(newspapers[i].getName().equalsIgnoreCase(Name)){
                return newspapers[i];
            }
        }
        return null;
    }
}
