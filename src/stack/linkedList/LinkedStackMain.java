package stack.linkedList;

import stack.arrayImplementation.Employee;

public class LinkedStackMain {

    public static void main(String[] args) {
        Employee shivamSaxena = new Employee("Shivam","Saxena",3212);
        Employee ankitDubey = new Employee("Ankit","Dubey",3210);
        Employee rishabhKhatreja = new Employee("Rishabh","Khatreja",3254);
        Employee vishalMadheshiya = new Employee("Vishal","Madheshiya",3456);

        LinkedStack stack = new LinkedStack();

        stack.push(shivamSaxena);
        stack.push(ankitDubey);
        stack.push(rishabhKhatreja);
        stack.push(vishalMadheshiya);
        stack.printStack();

        System.out.println("popped : " + stack.pop());

        System.out.println("At peek : " + stack.peek());

    }
}
