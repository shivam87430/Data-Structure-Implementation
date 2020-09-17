package queues;


import queues.arrayImplementation.ArrayQueue;

public class QueueMain {
    public static void main(String[] args) {
        Employee shivamSaxena = new Employee("Shivam","Saxena",3212);
        Employee ankitDubey = new Employee("Ankit","Dubey",3210);
        Employee rishabhKhatreja = new Employee("Rishabh","Khatreja",3254);
        Employee vishalMadheshiya = new Employee("Vishal","Madheshiya",3456);

        /*ArrayQueue queue = new ArrayQueue(5);
        queue.add(shivamSaxena);
        queue.add(ankitDubey);
        queue.remove();
        queue.add(rishabhKhatreja);
        queue.remove();
        queue.add(vishalMadheshiya);
        queue.remove();
        queue.add(shivamSaxena);
        queue.remove();
        queue.add(ankitDubey);*/

        /*queue.add(vishalMadheshiya);*/

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(shivamSaxena);
        queue.add(ankitDubey);
        queue.add(rishabhKhatreja);
        queue.add(vishalMadheshiya);
        queue.add(shivamSaxena);
        queue.printQueue();
    }
}
