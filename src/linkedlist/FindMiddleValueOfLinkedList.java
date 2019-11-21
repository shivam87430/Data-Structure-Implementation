package linkedlist;

public class FindMiddleValueOfLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        SinglyLinkedList.ListNode middleValueOfLinkedList = singlyLinkedList.findMiddleValueOfLinkedList();
        System.out.println("Middle Value Of Linked List is :: " + middleValueOfLinkedList.data);}
}
