package com.purustech.learning.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        // HashSet does not maintain any order
        // Set<String> firstNameSet = new HashSet<>();

        //TreeSet maintains the natural order ascending
          // Set<String> firstNameSet = new TreeSet<>();

        // LinkedHashSet maintains the insertion order
         Set<String> firstNameSet = new LinkedHashSet<>();

        firstNameSet.add("Santosh");
        firstNameSet.add("Jerry");
        firstNameSet.add("Mahesh");
        firstNameSet.add("Santosh");

        firstNameSet.add("Rinkesh");
        firstNameSet.add("Bikash");
        firstNameSet.add("Akash");
        firstNameSet.add("Sophia");

        System.out.println("No 1 .. Set elements are " + firstNameSet);

        //Iteration using for each loop
        System.out.println("Using for each loop to process elements of set");
        for(String name: firstNameSet){
            System.out.println("Name found in set " + name );
             // firstNameSet.remove("Sophia"); // ConcurrentModificationException
        }
        // Iteration using iterator
        System.out.println("Using Iterator to process elements of set");
        Iterator<String> iter = firstNameSet.iterator();

        while(iter.hasNext()){
            String name = iter.next();
            System.out.println("Name found in set " + name);
           /* if(name.equals("Rinkesh"))
                iter.remove(); */
        }

        // to check if an element exists in Set or not
        System.out.println("Set contains Santosh ? " + firstNameSet.contains("Santosh"));
        System.out.println("Set contains Asish ? " + firstNameSet.contains("Asish"));


        // Bulk Operations explained containsAll , addAll, retainAll, removeAll
        Set<String> secondNameSet = new TreeSet<>();
        secondNameSet.add("Santosh");
        secondNameSet.add("Sophia");
        secondNameSet.add("Mohit");
        secondNameSet.add("yyy");

        // containsAll checks for subset
        System.out.println("Does first name set contains all elements of second name set " + firstNameSet.containsAll(secondNameSet));

        //firstNameSet.addAll(secondNameSet); // union
        //System.out.println("Combination of first name set and second is " + firstNameSet);

       // firstNameSet.retainAll(secondNameSet); // intersection of the set
        // System.out.println("common elements between first and second name set are" + firstNameSet);

        firstNameSet.removeAll(secondNameSet); // remove the elements present in second set
        System.out.println("Removing all second name set from first contains" + firstNameSet);

    }
}

