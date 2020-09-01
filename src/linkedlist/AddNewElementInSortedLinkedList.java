package linkedlist;

public class AddNewElementInSortedLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        singlyLinkedList.addElementInSortedSinglyList(5);
        singlyLinkedList.display();
    }



}
