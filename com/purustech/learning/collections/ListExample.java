package com.purustech.learning.collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
         List<String> firstNameList = new ArrayList<>();

         //List<String> firstNameList = new LinkedList<>();

        firstNameList.add("Santosh");
        firstNameList.add("Jerry");
        firstNameList.add("Mahesh");
        firstNameList.add("Santosh");

        firstNameList.add("Rinkesh");
        firstNameList.add("Bikash");
        firstNameList.add("Akash");
        firstNameList.add("Sophia");
        System.out.println("Total number of elements in list is " + firstNameList.size());
        System.out.println("List elements are " + firstNameList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Boys");
        firstNameList.addAll(2,stringList);

        System.out.println("Ater adding string list elements are "  + firstNameList);
        firstNameList.set(5,"xxyy");
        System.out.println("5th element of the list is " + firstNameList.get(5));
        System.out.println("Last index of Santosh is " + firstNameList.lastIndexOf("Santosh"));

        //Iteration using for each loop
        System.out.println("Using for each loop to process elements of list");
        for(String name: firstNameList){
            System.out.println("Name found in list " + name );
            // firstNameList.remove("Sophia"); //concurrent modification exception
        }
        // Iteration using iterator
        System.out.println("Using Iterator to process elements of list");
        Iterator<String> iter = firstNameList.iterator();

        while(iter.hasNext()){
            String name = iter.next();
            System.out.println("Name found in list " + name);
            if(name.equals("Rinkesh"))
                iter.remove();
        }

        // to check if an element exists in list or not
        System.out.println("list contains Santosh ? " + firstNameList.contains("Santosh"));
        System.out.println("list contains Asish ? " + firstNameList.contains("Asish"));

        ListIterator<String> listIter = firstNameList.listIterator();

        System.out.println("Traversing elements in forward direction");
        while(listIter.hasNext()){

            System.out.println("index:"+listIter.nextIndex()+" value:"+listIter.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(listIter.hasPrevious()){

            System.out.println("index:"+listIter.previousIndex()+" value:"+listIter.previous());
        }

        // Bulk Operations explained containsAll , addAll, retainAll, removeAll
        List<String> secondNameList = new ArrayList<>();
        secondNameList.add("Santosh");
        secondNameList.add("Sophia");
        secondNameList.add("Mohit");
        secondNameList.add("yyy");

        // to Sort List
        Collections.sort(firstNameList);
        System.out.println("After sorting first name list is "  + firstNameList);

        System.out.println("Second List elements are " + secondNameList);

        // containsAll checks for sublist
        System.out.println("Does first name list contains all elements of second name list :" + firstNameList.containsAll(secondNameList));

        firstNameList.addAll(secondNameList); // union
        System.out.println("Combination of first name list and second is " + firstNameList);

        // firstNameList.retainAll(secondNameList); // intersection of the list
         //System.out.println("common elements between first and second name list are" + firstNameList);

        firstNameList.removeAll(secondNameList); // remove the elements present in second list
        System.out.println("Removing all second name list from first contains " + firstNameList);

    }
}

