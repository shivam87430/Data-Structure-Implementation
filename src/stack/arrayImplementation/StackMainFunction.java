package stack.arrayImplementation;

import java.util.Deque;

public class StackMainFunction {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Employee employee = new Employee("Shivam","Saxena",3212);
        Employee employee1 = new Employee("Ankit","Dubey",3210);
        Employee employee2 = new Employee("Rishabh","Khatreja",3254);
        Employee employee3 = new Employee("Vishal","Madheshiya",3456);


        System.out.println("Going to push the elements in the stack");
        //for push operation
        stack.push(employee);
        stack.push(employee1);
        stack.push(employee2);
        stack.push(employee3);
        stack.printStack();

        //for pop

        System.out.println("Going to pop the elements from the Stack");
        System.out.println(stack.pop());


        System.out.println("going to check the element in the peek");
        //for peek
        stack.peek();

        System.out.println("Number of elements in the stack is :: " + stack.top);

        System.out.println(1000 >>> 2);

    }
}
