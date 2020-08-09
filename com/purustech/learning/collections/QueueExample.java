package com.purustech.learning.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

          //  Queue<String> queue = new LinkedList();

         // Priority Queue stores element in natural order
            Queue<String> queue = new PriorityQueue();

        // BlockingQueue is used to created bounded queues i.e. it specifies max how many elements we can keep
          // BlockingQueue<String> queue = new ArrayBlockingQueue(2);

        // Methods
        // adding elements to Queue
        queue.add("hello"); // throws exception if queue is full : IllegalStateException
        queue.offer("friends"); // return false if queue is full
        queue.add("are");

        System.out.println("Priority queue " + queue);
        // to get the Q size
        System.out.println("Size of queue is : " + queue.size());

        //access via new for-loop
        System.out.println("Elements of Q iterated using new for loop ");
        for(String element : queue) {
            System.out.println("Element : " + element);
        }

        //access via Iterator
        System.out.println("Elements of Q iterated using iterator");
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("Element : " + element);
        }

        // removing  elements from queue, from head of queue
        String polledElement = queue.poll(); // return null if queue is empty
        System.out.println("Polled element is " + polledElement);
        String removedElement = queue.remove(); // throws exception when queue is empty

        // this section prints the queue in the order
        /*System.out.println("Polling starts");
        for(int i=0; i < queue.size() ; i++){
            String element = queue.poll();
            System.out.println("Element " + queue.poll());
        }*/

        // getting elements of queue without removing elements from Q, fetch beginning element
        String elementFetched = queue.element(); // If Q is empty throws NoSuchElementException
        String firstElement = queue.peek(); // return null , if Q is empty

        // to check if the Queue is having some element or not
        System.out.println("Queue contains :Hello ? " + queue.contains("Hello"));

        // to remove all element from the queue
        queue.clear();

    }
}
