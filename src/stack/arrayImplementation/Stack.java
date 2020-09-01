package stack.arrayImplementation;

import java.util.EmptyStackException;

public class Stack {

    private Employee[] stack;

    public int top;

    public Stack(int capacity){
        Employee[] employee = new Employee[capacity];
        stack = employee;
    }

    public void push(Employee employee){
        if(top == stack.length){
            //need to resize the array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;

    }

    public void printStack(){
        for (int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    public void peek(){
        System.out.println(stack[top - 1]);
    }

    public boolean isEmpty(){
        return top == 0;
    }

}
