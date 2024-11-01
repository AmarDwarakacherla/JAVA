package TCS_PRACTICE.ex_6;

import java.util.*;
public class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Inventory arr[]=new Inventory[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            int b=sc.nextInt();sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            arr[i]=new Inventory(a,b,c,d);
        }
        int limit=sc.nextInt();
        Inventory a[]=replenish(arr,limit);
        for(int i=0;i<a.length;i++)
        {
            if(a[i].getts()>75)
            {
                System.out.println(a[i].getid()+"Critical Filling");
            }
            else if(50<=a[i].getts() && a[i].getts()<=75)
            {
                System.out.println(a[i].getid()+"moderate filling");
            }
            else
            {
                System.out.println(a[i].getid()+"non critical filling");
            }

        }
    }
    public static Inventory[] replenish(Inventory arr[],int limit)
    {
        int count = 0;
        for (Inventory inventory : arr) {
            if (inventory.getts() >= limit) {
                count++;
            }
        }
        Inventory[] result = new Inventory[count];
        int index = 0;
        for (Inventory inventory : arr) {
            if (inventory.getts() >= limit) {
                result[index++] = inventory;
            }
        }

        return result;
    }
}
class Inventory
{
    int id;
    int mq;
    int cq;
    int ts;
    public Inventory(int id,int mq,int cq,int ts)
    {
        this.id=id;
        this.mq=mq;
        this.cq=cq;
        this.ts=ts;
    }
    public int getid()
    {
        return id;
    }
    public int getmq()
    {
        return mq;
    }
    public int getcq()
    {
        return cq;
    }
    public int getts()
    {
        return ts;
    }

}
