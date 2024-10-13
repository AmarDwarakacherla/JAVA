package DailyCoding;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null)
            head = newnode;
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
    public void deleteAlt() {
        if(head == null)
            return;

        Node current = head;
        while(current != null && current.next != null){
            current.next = current.next.next;
            current = current.next;
        }

    }
}
public class Delete_Alternate_Nodes {

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.display();
        ll.deleteAlt();
        ll.display();
    }
}
