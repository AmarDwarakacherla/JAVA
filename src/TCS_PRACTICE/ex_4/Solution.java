package TCS_PRACTICE.ex_4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);
        FootWear[] fw = new FootWear[5];
        for(int i=0;i<5;i++)
        {
//            fw[i] = new FootWear(input.nextInt(), input.nextLine(), input.nextLine(), input.nextInt());
            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            String type = input.nextLine();
            int price = input.nextInt();
            input.nextLine();
            fw[i] = new FootWear(id, name, type, price);

        }
        System.out.println(Arrays.toString(fw));
        String footWearType = input.nextLine();
        String inputFootwearBrand=input.nextLine();
        int count = getCountByType(fw,footWearType);
        if(count>0)
            System.out.println(count);
        else
            System.out.println("Footwear Not Available");
        FootWear find = getSecondHighestPriceByBrand(fw,inputFootwearBrand);
        if(find!=null)
            System.out.println(find);
        else
            System.out.println("Brand Not Available");
    }
    public static int getCountByType(FootWear[] fw,String type)
    {
        int count = 0;
        for(int i=0;i<fw.length;i++)
        {
            if(fw[i].getFootwearType().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;
    }
    public static FootWear getSecondHighestPriceByBrand(FootWear[] fw, String footWearName) {
        FootWear first = null;
        FootWear second = null;
        for (int i = 0; i < fw.length; i++)
        {
            if(fw[i].getFootwearName().equalsIgnoreCase(footWearName))
            {
                if(first == null || first.getPrice()<fw[i].getPrice())
                {
                    second = first;
                    first = fw[i];
                }
                else if(second == null ||fw[i].getPrice() > second.getPrice() && fw[i].getPrice() < first.getPrice())
                {
                    second = fw[i];
                }
            }
        }

        return second;
    }
}
