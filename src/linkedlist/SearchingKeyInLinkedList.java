package linkedlist;

public class SearchingKeyInLinkedList {
    public static void main(String[] args) {
        Addition addition = new Addition();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        addition.simpleInsertion(singlyLinkedList);
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

