package linkedlist;

import sun.awt.image.ImageWatched;

public class ReverseLinkedListInAGroupOfSizeK {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
       SinglyLinkedList.ListNode head = singlyLinkedList.reverseLinkedListInAGroupOfSize(singlyLinkedList.head,3);
        SinglyLinkedList.ListNode current = head;
        while (current !=null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
