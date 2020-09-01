package linkedlist;

public class SearchingKeyInLinkedList {
    public static void main(String[] args) {
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        linkedListImplementation.simpleInsertion(singlyLinkedList);
        SearchingKeyInLinkedList searchingKeyInLinkedList = new SearchingKeyInLinkedList();
        searchingKeyInLinkedList.searchingKeyInLinkedList(10,singlyLinkedList);
    }

    public void searchingKeyInLinkedList(int key,SinglyLinkedList singlyLinkedList){
        if(singlyLinkedList.searchKeyInLinkedList(key)){
            System.out.println("Key is Found");
        }else {
            System.out.println("Key is not Found");
        }
    }
}

