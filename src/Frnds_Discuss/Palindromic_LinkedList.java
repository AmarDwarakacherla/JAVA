package Frnds_Discuss;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Palindromic_LinkedList {
    public static void main(String[] args) {
       Linked_List ll = new Linked_List();
       ll.add(10);
       ll.add(20);
       ll.add(20);
       ll.add(20);
       ll.add(10);
//       ll.display();
        System.out.println(isPalindromeApproach3(ll));
    }
    public static boolean isPalindromeApproach1(Linked_List ll){
        Stack<Integer> stack = new Stack<>();
        Node temp = ll.getHead();
        Node temp2 = ll.getHead();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        while(temp2 != null){
            if(temp2.data != stack.peek()) return false;
            stack.pop();
            temp2 = temp2.next;
        }
       return true;
    }

    // Add the nodes to List and check whether the list is palindrome or not

    public static boolean isPalindromeApproach3(Linked_List ll){
        Node head = ll.getHead();
        Node slow = ll.getHead();
        Node fast = slow;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node half = reverse(slow.next);
        Node first = head;
        Node second = half;
        while (second != null) {
            if (first.data != second.data) {
               return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
