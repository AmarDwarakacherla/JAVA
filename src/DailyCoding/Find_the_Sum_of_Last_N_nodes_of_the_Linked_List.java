package DailyCoding;

public class Find_the_Sum_of_Last_N_nodes_of_the_Linked_List {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(9);
        ll.insert(6);
        ll.insert(3);
        ll.insert(4);
        ll.insert(10);
        ll.display();
        System.out.println(sumOfLastN_Nodes(ll.head,3));
    }
    static int sumOfLastN_Nodes(Node head, int n) {
        int len = 0;
        Node t = head;
        while(t!=null){
            len++;
            t = t.next;
        }
        len = len-n;
        int tCount = 0;
        int sum = 0;
        Node temp = head;
        while(temp!=null){
            if(tCount>=len){
                sum += temp.data;
            }
            tCount++;
            temp = temp.next;
        }
        return sum;
    }
}
