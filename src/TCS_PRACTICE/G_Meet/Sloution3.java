package TCS_PRACTICE.G_Meet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Create class Medicine with below attributes:
//
class Medicine{
    String name;
    String batch;
    String disease;
    int price;
    public Medicine(String name, String batch, String disease, int price)
    {
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getBatch() {
        return batch;
    }
    public String getDisease() {
        return disease;
    }
    public int getPrice() {
        return price;
    }
}
//MedicineName - String
//batch - String
//disease - String
//price - int
//
//Create class Solution and implement static method "getPriceByDisease" in the Solution class.
//This method will take array of Medicine objects and a disease String as parameters.
//And will return another sorted array of Integer objects where the disease String matches with the
//original array of Medicine object's disease attribute (case insensitive search).
//
//Write necessary getters and setters.
//
//Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects
//referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease"
//method and print the result.
//
//Input
//-------------
//
//dolo650
//FAC124W
//fever
//100
//paracetamol
//PAC545B
//bodypain
//150
//almox
//ALM747S
//fever
//200
//aspirin
//ASP849Q
//flu
//250
//fever
//
//Output
//---------
//100
//200
public class Sloution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] m = new Medicine[4];
        for (int i = 0; i < m.length; i++)
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            m[i] = new Medicine(a,b,c,d);
        }
        String dis = sc.nextLine();
        int[] ans = getPriceByDisease(m,dis);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }
        else{
            System.out.println("No medicine found");
        }
    }
    public static int[] getPriceByDisease(Medicine[] m, String dis)
    {
        ArrayList<Integer> t = new ArrayList<>();
        for(Medicine med: m){
            if(med.getDisease().equalsIgnoreCase(dis)){
                t.add(med.getPrice());
            }
        }
        if (t.isEmpty()) {
            return null;
        }
        Collections.sort(t);

        int[] result = new int[t.size()];
        for (int i = 0; i < t.size(); i++) {
            result[i] = t.get(i);
        }
        return result;
    }
}
