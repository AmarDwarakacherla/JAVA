package Frnds_Discuss;

public class Find_Loop_in_a_Linked_List {
    public static void main(String[] args) {

        Linked_List list = new Linked_List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Node head = list.getHead();
        Node temp = head;
        Node loop = null;
        //Creating  a loop
        while (temp.next != null) {
            if (temp.data == 3) {
                loop = temp;
            }
            temp = temp.next;
        }
        temp.next = loop; // Creates loop
        System.out.println(checkLoop(head));
    }

    public static boolean checkLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
