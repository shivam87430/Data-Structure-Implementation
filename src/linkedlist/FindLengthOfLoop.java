package linkedlist;

public class FindLengthOfLoop {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList =  new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.havingLoop(singlyLinkedList);
        int lengthOfLoop = singlyLinkedList.findLengthOfLoop(singlyLinkedList.head);
        System.out.println(lengthOfLoop);
    }
}
