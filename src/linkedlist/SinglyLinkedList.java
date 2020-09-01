package linkedlist;

import java.util.ArrayList;
import java.util.List;

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


    public int count(){
        int count = 0;
        if(head == null){
            System.out.println("Count Of Linked list is : " + count);
        }
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
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

    /*Find Middle Value Of Linked List */

    public ListNode findMiddleValueOfLinkedList(){
        ListNode currentPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            currentPtr = currentPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return currentPtr;
    }

    /*Remove Duplicates From Linked List*/
    public void removeDuplicatesFromLinkedList(){
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
    }


    /*Add Element in Sorted Singly Linked List*/
    public void addElementInSortedSinglyList(int value){
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        while (current!=null && current.data<newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }

    /*Remove Element From Linked List*/
    public void removeElementFromLinkedList(int key){
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null) {
            System.out.println("Data is not present in linked List");
        }
        else if(temp == null){
            head = current.next;
        }else {
         temp.next = current.next;
        }
    }

    /*Check List Node is Containing Loop or Not*/
    public boolean checkLoop(ListNode head){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean havingLopp = false;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                havingLopp = true;
                return havingLopp;
            }
        }
        return havingLopp;
    }

    /*Check list is Palindrome or not*/
    public void checkListIsPalindromeOrNot(){
        ListNode current = head;
        int count = count();
        if(count % 2 == 0){
            int mid = count/2;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<mid;i++){
                list.add(current.data);
                current = current.next;
            }
            ListNode head = traverseTheLinkedList();
            ListNode current1 = head;
            List<Integer> list1 = new ArrayList<>();
            for (int  i=0;i<mid;i++){
                list1.add(current1.data);
                current1 = current1.next;
            }
            if(list.containsAll(list1)){
                System.out.println("Linked List is a Palindrome");
            }else {
                System.out.println("Linked List is not Palindrome");
            }
        }else {
            int mid = (count+1)/2;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<mid-1;i++){
                list.add(current.data);
                current = current.next;
            }
            ListNode head = traverseTheLinkedList();
            ListNode current1 = head;
            List<Integer> list1 = new ArrayList<>();
            for (int  i=0;i<mid-1;i++){
                list1.add(current1.data);
                current1 = current1.next;
            }
            if(list.containsAll(list1)){
                System.out.println("Linked List is a Palindrome");
            }else {
                System.out.println("Linked List is not Palindrome");
            }
        }
    }

    /*Reverse Linked List in a Group of size k*/
        public ListNode reverseLinkedListInAGroupOfSize(ListNode head , int k){
            ListNode current = head;
            ListNode previous = null;
            ListNode next = null;
            int count = 0;
            while (count < k && current !=null){
               next = current.next;
               current.next = previous;
               previous = current;
               current = next;
               count++;
            }

            if(next != null)
               head.next = reverseLinkedListInAGroupOfSize(next,k);
            return previous;
        }

        public ListNode removeNthNodeFromEnd(ListNode head,int k){
            ListNode mainPointer = head;
            ListNode referencePointer = head;
            int count = 0;
            while (count < k){
                referencePointer = referencePointer.next;
                count++;
            }
            while (referencePointer!=null){
               mainPointer = mainPointer.next;
               referencePointer = referencePointer.next;
            }
            return mainPointer;
        }

        public ListNode entryPointOfLoop(ListNode head){
            ListNode fastPtr = head;
            ListNode slowPtr = head;
            boolean havingLopp = false;
            while (fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if(slowPtr == fastPtr){
                    havingLopp = true;
                    break;
                }
            }

            if(havingLopp){
                System.out.println("Having loop");
                slowPtr = head;
                while (slowPtr!=fastPtr){
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
            }else {
                System.out.println("Loop doesn't exist");
                slowPtr = null;
            }
            return slowPtr;
        }

        public int findLengthOfLoop(ListNode head){
            ListNode slowptr = head;
            ListNode fastptr = head;
            int count = 0;
            boolean havingLoop = false;
            while (fastptr!=null && fastptr.next!=null){
                fastptr = fastptr.next.next;
                slowptr = slowptr.next;
                if(slowptr==fastptr){
                    havingLoop = true;
                    break;
                }
            }
            if(havingLoop){
                slowptr = head;
                while (slowptr != fastptr){
                    slowptr = slowptr.next;
                    fastptr = fastptr.next;

                }
            }else{
                System.out.println("Loop doesn't exist");
                return count;
            }
            while (slowptr != fastptr.next){
                fastptr = fastptr.next;
                count++;
            }
            return count;

        }


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        char value = stringBuilder.charAt(0);
        System.out.println(Integer.parseInt(String.valueOf(value)));
        }
}
