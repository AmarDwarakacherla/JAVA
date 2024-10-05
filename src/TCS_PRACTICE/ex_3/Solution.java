package TCS_PRACTICE.ex_3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TravelAgencies[] ta = new TravelAgencies[4];
        for(int i=0;i<4;i++)
        {
//            ta[i] = new TravelAgencies(input.nextInt(), input.nextLine(), input.nextLine(), input.nextInt(), input.nextBoolean());
            int regNo = input.nextInt();
            input.nextLine();
            String agencyName = input.nextLine();
            String packageType = input.nextLine();
            int price =input.nextInt();
            boolean flightFacility = input.nextBoolean();
            input.nextLine();
            ta[i] = new TravelAgencies(regNo, agencyName, packageType,price, flightFacility);
        }
        int getRegNo = input.nextInt();
        input.nextLine();
        String getPackageType = input.nextLine();
        System.out.println(Arrays.toString(ta));
        System.out.println(findAgencyWithHighestPackagePrice(ta));
        TravelAgencies temp = agencyDetailsForGivenldAndType(ta,getRegNo,getPackageType);
        if(temp==null)
        {
            System.out.print("No Data Found");
        }
        else
        {
            System.out.println(temp.getAgencyName()+" : "+temp.getPrice());
        }
    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] ta)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<ta.length;i++)
        {
            if(ta[i].getPrice() > max)
            {
                max = ta[i].getPrice();
            }
        }
        return max;
    }
    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] ta, int regNo, String packageType)
    {
        for(int i=0;i<ta.length;i++)
        {
            if(ta[i].isFlightFacility())
            {
                if(ta[i].getRegNo() == regNo && ta[i].getPakageType().equalsIgnoreCase(packageType))
                {
                    return ta[i];
                }
            }
        }
        return null;
    }
}
