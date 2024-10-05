package TCS_PRACTICE.ex_6;

import java.util.Arrays;
import java.util.Scanner;

class NewsPaper{
    private int regNo;
    private String name;
    private int publicationYear;
    private int price;


    NewsPaper(int regNo,String name, int publicationYear, int price)
    {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getRegNo()
    {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "regNo=" + regNo +
                ", name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                '}';
    }
}
public class Solution {
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);
        NewsPaper[] np = new NewsPaper[4];
        for(int i=0;i<4;i++)
        {
            int regNo = input.nextInt();input.nextLine();
            String name = input.nextLine();
            int year = input.nextInt();input.nextLine();
            int price = input.nextInt();input.nextLine();

            np[i] = new NewsPaper(regNo, name, year, price);
        }
        int findYear = input.nextInt();input.nextLine();
        String Type = input.nextLine();
        System.out.println(Arrays.toString(np));
        int totalPrice = findTotalPriceByPublicationYear(np,findYear);
        if(totalPrice == 0)
            System.out.println("No Newspaper found with the mentioned attribute");
        else
            System.out.println(totalPrice);
        NewsPaper search = searchNewspaperByName(np, Type);
        if(search!=null)
            System.out.println(search);
        else
            System.out.println("No Newspaper found with the given name");
    }


    public static int findTotalPriceByPublicationYear(NewsPaper[] np, int year)
    {
        int price = 0;
        for(NewsPaper newspaper : np)
        {
            if(newspaper.getPublicationYear() == year)
            {
                price += newspaper.getPrice();
            }
        }
        return price;
    }

    public static NewsPaper searchNewspaperByName(NewsPaper[] np, String type)
    {
        for(NewsPaper newspaper : np)
        {
            if(newspaper.getName().equalsIgnoreCase(type))
                return newspaper;
        }
        return null;
    }

}
