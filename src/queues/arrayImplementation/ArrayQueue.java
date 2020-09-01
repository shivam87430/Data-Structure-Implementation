package queues.arrayImplementation;


import queues.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    //0             -back
    //1
    //2
    //3   -vishal     -front
    //4   -shivam



    public void add(Employee employee){
        if(isEmpty() == queue.length -1){
            //resize the array.
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            queue = newArray;
        }

        queue[back] = employee;
        if(back < queue.length){
            back++;
        }else{
            back = 0;
        }

    }

    public Employee remove(){
        if(isEmpty() == 0){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        front++;
        if(isEmpty() == 0){
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek(){
        if(isEmpty() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }


    public int isEmpty(){
        return back - front;
    }

    public void printQueue(){
        for(int i = front;i<back;i++){
            System.out.println(queue[i]);
        }
    }
}
