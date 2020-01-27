package linkedlist;

public class RemoveNthNodeFromLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        SinglyLinkedList.ListNode listNode = singlyLinkedList.removeNthNodeFromEnd(singlyLinkedList.head,2);
        System.out.println("Data is :: " + listNode.data);
    }
}
