package linkedlist;

public class CheckingLoop {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.havingLoop(singlyLinkedList);
        boolean checkingLoop = singlyLinkedList.checkLoop();
        if(checkingLoop){
            System.out.println("Loop is present in Linked List");
        }else
            System.out.println("Loop is not present in linked List");
    }
}
