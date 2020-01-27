package linkedlist;

public class FindEntryPointOfLoop {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList =  new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.havingLoop(singlyLinkedList);
        SinglyLinkedList.ListNode listNode = singlyLinkedList.entryPointOfLoop(singlyLinkedList.head);
        System.out.println("Entry Point is :: " + listNode.data);
    }
}
