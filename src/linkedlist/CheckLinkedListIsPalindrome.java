package linkedlist;

public class CheckLinkedListIsPalindrome {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        singlyLinkedList.checkListIsPalindromeOrNot();
    }

}
