package linkedlist;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        singlyLinkedList.removeDuplicatesFromLinkedList();
        System.out.println("After Removing Duplicates");
        singlyLinkedList.display();
    }
}
