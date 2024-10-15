package collections;

import java.util.*;

public class Practice {

    /*
    =======================================
             WHAT ARE COLLECTIONS?
    =======================================
    - A collection is an object that can hold a group of elements or objects.
    - Java's Collection Framework provides various data structures to store and manipulate collections of data.
    - Different collections allow different behaviors:
      * Some allow duplicates, others don’t.
      * Some maintain order, others don’t.

    WHY USE COLLECTIONS?
    - Collections provide reusable data structures that simplify tasks like storing, searching, and sorting data.
    - They come with built-in methods that make it easier to work with groups of elements (e.g., adding, removing, searching).
    =======================================
    */

    public static void main(String[] args) {

        // ===========================
        // Example 1: Set
        // ===========================
        /*
        What is a Set?
        - A Set is an interface/ collection that DOES NOT allow duplicate elements.
        - It ensures uniqueness, meaning no element can appear more than once.
        - The order of elements is NOT guaranteed (except for some implementations like LinkedHashSet and TreeSet).

        Pros:
        - Ensures no duplicates.
        - HashSet provides fast performance (constant time for adding/removing).

        Cons:
        - No guaranteed order (in HashSet).
        - Cannot access elements by index (unordered)

        Restrictions:
        - Cannot store duplicate elements.
        - Does not support indexing

        Use a Set when you need to ensure that no duplicates are present in your collection.

        */

        System.out.println("--- Set Example ---");
        Set<String> fruitSet = new HashSet<>(); // Create a new HashSet of Strings
        fruitSet.add("apple");  // Add "apple" to the set
        fruitSet.add("banana"); // Add "banana" to the set
        fruitSet.add("orange"); // Add "orange" to the set
        fruitSet.add("lemon");  // Add "lemon" to the set

        // Attempt to add a duplicate element
        fruitSet.add("lemon");  // Since "lemon" is already in the set, this will be ignored (no duplicates allowed)

        // Size of the set (duplicates are not stored)
        System.out.println("Size of set: " + fruitSet.size()); // Output: 4 (because the duplicate "lemon" was not added)

        // Print the elements of the set (remember, the order is not guaranteed)
        System.out.println("Set elements: " + fruitSet); // Output: [banana, orange, lemon, apple] (order may vary)

        // Check if an element exists
        System.out.println("Contains 'apple'? " + fruitSet.contains("apple")); // Output: true

        // Remove an element
        fruitSet.remove("banana");
        System.out.println("Set after removing 'banana': " + fruitSet); // Output: Set after removing 'banana': [orange, lemon, apple]

        System.out.println();

        // ===========================
        // Example 2: List
        // ===========================
        /*
        What is a List?
        - A List is an ordered collection that CAN contain duplicate elements.
        - The order in which you insert elements is maintained, and elements can be accessed by their index (position).

        Pros:
        - Ordered collection, elements are retrieved in the same order they were added.
        - Allows duplicates.
        - Can access elements by index.

        Cons:
        - Can be slower than a Set for certain operations (like checking for duplicates).

        Restrictions:
        - None, except for memory limits.

        Popular List implementations:
        - ArrayList: Fast random access, resizable array.

        Use a List when you care about the order of elements and allow duplicates.
        */

        System.out.println("--- List Example ---");
        List<String> fruitList = new ArrayList<>(); // Create a new ArrayList of Strings
        fruitList.add("apple");  // Add "apple" to the list
        fruitList.add("banana"); // Add "banana" to the list
        fruitList.add("orange"); // Add "orange" to the list
        fruitList.add("lemon");  // Add "lemon" to the list
        fruitList.add("lemon");  // Add a duplicate "lemon" (Lists allow duplicates)

        // Size of the list (duplicates are stored)
        System.out.println("Size of list: " + fruitList.size()); // Output: 5 (duplicates are counted)

        // Print the elements of the list (order is preserved)
        System.out.println("List elements: " + fruitList); // Output: [apple, banana, orange, lemon, lemon]

        // Get a specific element by its index
        System.out.println("Element at index 2: " + fruitList.get(2)); // Output: orange

        // Remove an element by index
        fruitList.remove(1); // Removes the element at index 1 (which is "banana")
        System.out.println("List after removing element at index 1: " + fruitList); // Output: [apple, orange, lemon, lemon]

        System.out.println();

        // ===========================
        // Example 3: Queue
        // ===========================
        /*
        What is a Queue?
        - A Queue is an ordered collection where elements are processed in the order they were added (FIFO: First In, First Out).
        - A queue is like a line: the first person in line is the first one served.

        Pros:
        - Processes elements in the order they were added (FIFO).

        Cons:
        - No random access to elements (like in a list).

        Use a Queue when you need to process elements in the same order they arrive.
        */

        System.out.println("--- Queue Example ---");
        Queue<String> fruitQueue = new LinkedList<>(); // Create a new LinkedList that behaves like a Queue
        fruitQueue.add("apple");  // Add "apple" to the queue
        fruitQueue.add("banana"); // Add "banana" to the queue
        fruitQueue.add("orange"); // Add "orange" to the queue

        System.out.println(fruitQueue);

        // Remove the head of the queue (FIFO: First In, First Out)
        String head = fruitQueue.remove(); // Removes "apple" (the first element added)
        System.out.println("Removed head: " + head); // Output: apple

        // Peek at the current head of the queue without removing it
        String nextHead = fruitQueue.peek(); // Peek at "banana" (next in line)
        System.out.println("Next head: " + nextHead); // Output: banana

        // Print the remaining elements in the queue
        System.out.println("Remaining elements: " + fruitQueue); // Output: [banana, orange]

        // Add more elements to the queue
        fruitQueue.add("lemon");
        System.out.println("Queue after adding 'lemon': " + fruitQueue); // Output: [banana, orange, lemon]

        System.out.println();

        // ===========================
        // Example 4: Map
        // ===========================
        /*
        What is a Map?
        - A Map is a collection of key-value pairs.
        - Keys must be unique, but values can be duplicated.
        - Maps are useful when you need to associate a unique key with a value (like a dictionary).

        Pros:
        - Fast lookups by key.

        Cons:
        - HashMap doesn’t maintain any specific order

        Restrictions:
        - Keys must be unique; duplicate keys will overwrite the old value.

        Use a Map when you need to store key-value pairs (like usernames and passwords).
        */

        System.out.println("--- Map Example ---");
        Map<String, Integer> fruitCalories = new HashMap<>(); // Create a new HashMap that maps Strings to Integers
        fruitCalories.put("apple", 95);   // "apple" is the key, 95 is the value
        fruitCalories.put("banana", 105); // "banana" is the key, 105 is the value
        fruitCalories.put("orange", 62);  // "orange" is the key, 62 is the value
        fruitCalories.put("lemon", 17);   // "lemon" is the key, 17 is the value

        // Attempt to add a duplicate key with a different value
        fruitCalories.put("lemon", 20); // "lemon" key already exists, so the value 17 is replaced with 20

        // Size of the map (no duplicate keys allowed)
        System.out.println("Size of map: " + fruitCalories.size()); // Output: 4

        // Access a value by its key
        System.out.println("Calories in a lemon: " + fruitCalories.get("lemon")); // Output: 20 (since 17 was overwritten)

        // Remove an element by its key
        fruitCalories.remove("orange"); // Removes the key "orange" and its value
        System.out.println("Map after removing 'orange': " + fruitCalories); // Output: {apple=95, banana=105, lemon=20}
    }
}

