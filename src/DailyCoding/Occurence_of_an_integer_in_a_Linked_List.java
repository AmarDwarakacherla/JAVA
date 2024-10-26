package DailyCoding;

public class Occurence_of_an_integer_in_a_Linked_List {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(1);
        ll.insert(2);
        ll.insert(1);
        ll.insert(3);
        ll.insert(1);
        System.out.println(count(ll.head,1));

    }
    public static int count(Node head, int key) {
        int count = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
}
