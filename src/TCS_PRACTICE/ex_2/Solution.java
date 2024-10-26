package TCS_PRACTICE.ex_2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);
        HeadSets[] hs = new HeadSets[4];
        for(int i=0;i<4;i++)
        {
            String headsetName = input.next();
            String brand = input.next();
            int price = input.nextInt();
            boolean available = input.nextBoolean();
            input.nextLine();
            hs[i] = new HeadSets(headsetName, brand, price, available);
        }
        System.out.println(Arrays.toString(hs));
        String findBrand = input.nextLine();
        int sum = findTotalPriceForGivenBrand(hs, findBrand);
        System.out.println(sum);
        HeadSets secMin = findAvailabilityHeadsetWithSecondMinPrice(hs);
        System.out.println(secMin.toString());
    }
    private static int findTotalPriceForGivenBrand(HeadSets[] hs, String findBrand) {
        int sum = 0;
        for(int i=0;i<hs.length;i++)
        {
            if(hs[i].getBrand().equalsIgnoreCase(findBrand))
            {
                sum += hs[i].getPrice();
            }
        }
        return sum;
    }

    private static HeadSets findAvailabilityHeadsetWithSecondMinPrice(HeadSets[] hs){
        HeadSets first = null;
        HeadSets second = null;
        for(HeadSets headset: hs)
        {
            if(headset.isAvailable())
            {
                if(first == null || headset.getPrice()< first.getPrice())
                {
                    second = first;
                    first = headset;
                }
                else if(second == null || headset.getPrice() < second.getPrice())
                {
                    second = headset;
                }
            }
        }
        return second;
    }
}
