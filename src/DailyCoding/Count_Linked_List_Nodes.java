package DailyCoding;


public class Count_Linked_List_Nodes {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        System.out.println(getCount(ll.head));
    }
    public static int getCount(Node head){
        Node t = head;
        int count = 0;
        while(t!=null){
            count++;
            t = t.next;
        }
        return count;
    }
}
