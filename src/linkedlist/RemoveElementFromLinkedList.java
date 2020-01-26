package linkedlist;

public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        singlyLinkedList.removeElementFromLinkedList(1);
        singlyLinkedList.display();
    }
}
