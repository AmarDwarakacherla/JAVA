package TCS_PRACTICE.G_Meet;
import java.util.*;


//Create class Inventory with below attributes:
//
//inventoryId - int
//maximumQuantity - int
//currentQuantity - int
//threshold - int
class Inventory{
    private int inventoryId;
    private int maxQuantity;
    private int currQuantity;
    private int threshold;
    public Inventory(int inventoryId, int maxQuantity, int currQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.currQuantity = currQuantity;
        this.threshold = threshold;
    }
    public int getInventoryId() {
        return inventoryId;
    }
    public int getMaxQuantity() {
        return maxQuantity;
    }
    public int getCurrQuantity() {
        return currQuantity;
    }
    public int getThreshold() {
        return threshold;
    }
}
//Create class Solution and implement static method "Replenish" in the Solution class.
//This method will take array of Inventory objects and a limit int as parameters.
//And will return another array of Inventory objects where the limit int is greater than or equal to the original array of
//Inventory object's threshold attribute.
//
//Write necessary getters and setters.
//
//Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above
//sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
//if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print
//"Moderate Filling". Else print "Non-Critical Filling"
//
//Input
//---------------------------
//1
//100
//50
//50
//2
//200
//60
//40
//3
//150
//35
//45
//4
//80
//45
//40
//45
//
//Output
//----------------------------
//2 Non-Critical Filling
//3 Non-Critical Filling
//4 Non-Critical Filling
public class Solution7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory[] inventory = new Inventory[4];
        for(int i=0;i<4;i++){
            int a = input.nextInt();
            int b = input.nextInt();;
            int c = input.nextInt();
            int d = input.nextInt();
            inventory[i] = new Inventory(a, b, c, d);
        }
        int limit = input.nextInt();
        Inventory[] inv = Replenish(inventory, limit);
        for(int i=0;i<inv.length;i++){
            if(inv[i].getThreshold()>75){
                System.out.println(inv[i].getInventoryId()+" "+"Critical Filling");
            }
            else if(inv[i].getThreshold()>=50 && inv[i].getThreshold()<=75){
                System.out.println(inv[i].getInventoryId()+" "+"Moderate Filling");
            }
            else{
                System.out.println(inv[i].getInventoryId()+" "+"Non-Critical Filling");
            }
        }
    }
    static Inventory[] Replenish(Inventory[] inventory, int limit){
        int count = 0;
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                count++;
            }
        }
        Inventory[] t = new Inventory[count];
        int idx = 0;
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                t[idx++] = inventory[i];
            }
        }
        return  t;
    }
}
