package linkedlist;

public class Addition {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Addition addition = new Addition();
        addition.insertionOnFirstNode(singlyLinkedList);
    }

    public void simpleInsertion(SinglyLinkedList singlyLinkedList){
        singlyLinkedList.head = new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(20);
        SinglyLinkedList.ListNode third =  new SinglyLinkedList.ListNode(30);
        SinglyLinkedList.ListNode fourth = new SinglyLinkedList.ListNode(1);

//        Now Data is stored in Linked List further we have to connect it so that it forms a linked list

        singlyLinkedList.head.next = second; // 10 --> 20
        second.next = third;                 // 10 --> 20 --> 30
        third.next = fourth;                 // 10 --> 20 --> 30 --> 1

//        Printing value of Linked List
        singlyLinkedList.display();

//        Count Of Linked List
        singlyLinkedList.count();
    }

    public void insertionOnFirstNode(SinglyLinkedList singlyLinkedList){
        singlyLinkedList.insertNodeIntoFirst(100);
        singlyLinkedList.insertNodeIntoFirst(200);
        singlyLinkedList.insertNodeIntoFirst(-1);
        singlyLinkedList.display();
        SinglyLinkedList.ListNode head = singlyLinkedList.traverseTheLinkedList();
        SinglyLinkedList.ListNode current = head;
        while (current !=null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertIntoLastNode(SinglyLinkedList singlyLinkedList){
        singlyLinkedList.insertIntoLastNode(10);
        singlyLinkedList.insertIntoLastNode(20);
        singlyLinkedList.display();
    }

}
