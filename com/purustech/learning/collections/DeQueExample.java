package com.purustech.learning.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueExample {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList();
        //  Deque<String> deque = new ArrayDeque(1);

        // inserting elements to the deque at the end
        deque.add("how"); // same as addLast
        deque.addLast("are");
        deque.offer("you"); // return false if dequeue is full
        deque.addLast("?");
        deque.addFirst("friends");
        deque.offerFirst("hello");

        // ultimately deque having elements  now is: hello friends how are you ?

        // removing elements from first
        String polledElement = deque.poll(); // same as pollFirst , return null if queue is empty
        System.out.println("polled element using poll is: " + polledElement); // hello

        polledElement = deque.remove(); // same as removeFirst, throws NoSuchElementException
        System.out.println("polled element using remove is: " + polledElement); // friends

        // ultimately deque having elements  now is :  how are you ?

        // removing elements from last
        polledElement = deque.pollLast(); // same as pollFirst , return null if queue is empty
        System.out.println("polled element using pollLast is: " + polledElement); // ?

        polledElement = deque.removeLast(); // same as removeFirst, throws NoSuchElementException
        System.out.println("polled element using removeLast is: " + polledElement); // you

        // ultimately deque having elements  now is :  how are

        //Examining the deque
        String examinedElement = deque.peek(); // same as peekFirst , returns the 1st element of dequeue
        System.out.println("examined element using peek is: " + examinedElement); // how
        examinedElement = deque.getFirst();
        System.out.println("examined element using getFirst is: " + examinedElement); // how

        examinedElement = deque.peekLast();
        System.out.println("examined element using peekLast is: " + examinedElement); // are

        System.out.println("Deque elements upto here is: " + deque);


        deque.push("abc");
        // ultimately deque having elements  now is :  how are abc
        String poppedElement = deque.pop(); // same as removeLast
        System.out.println("popped element using pop method is: " + poppedElement); // abc

        // ultimately deque having elements  now is :  how are
        while(deque.size() >0){
            System.out.println( deque.poll());
        }

        System.out.println("Deque after all operation " + deque);
        // ultimately deque having elements  now is :  [no elements in dequeue]

    }
}
