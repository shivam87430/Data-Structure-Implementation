package linkedlist;

public class SinglyLinkedList {

    public ListNode head;

    public static class ListNode{

        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;   // used to set Data in node
            this.next = null;   //Referenced to a next node in list and next is null
                                // because when we create any node its next pointer always firstly set to be null
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--> " );
            current = current.next;
        }
        System.out.println("null");
    }


    public void count(){
        int count = 0;
        if(head == null){
            System.out.println("Count Of Linked list is : " + count);
        }
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        System.out.println("Count OF Linked List is : " + count) ;
    }

    public void insertNodeIntoFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertIntoLastNode(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        if(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean searchKeyInLinkedList(int key){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while (current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode traverseTheLinkedList(){
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
