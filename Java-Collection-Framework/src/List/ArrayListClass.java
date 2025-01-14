package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        //List<Integer> ara = new ArrayList<>();
        ArrayList<Integer> ara = new ArrayList<>();
        /*
         * Add(value) operation adds elements to the array list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        ara.add(1);
        ara.add(100);
        ara.add(2);
        System.out.println(ara);
        /*
         * Add(index, value) operation adds elements to the array list.
         * It adds element to the array list by particular index number.
         * Subsequent elements are shifted after the add operation.
         * Time complexity - O(n)
         */
        ara.add(1, 500);
        System.out.println(ara);
        /*
         * It returns the size of the array list.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        System.out.println(ara.size());
        /*
         * Set operation replaces elements to the array list by specific index number.
         * Time complexity - O(1)
         */
        ara.set(1, 700);
        System.out.println(ara);
        /*
         * Remove operation removes elements of a specific index from the array list.
         * The subsequent elements are shifted after the removal.
         * Time complexity - O(n)
         */
        ara.remove(1);
        System.out.println(ara);
        /*
         * We can sort any ArrayList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(ara);
        System.out.println(ara);
        /*
         * Checks if the array list contains particular element
         * Time complexity - O(n)
         */
        /*
         * Clear operation removes all the elements from the array list.
         * Time complexity - O(n)
         */
        /*
         * Checks if the array list contains all the mentioned elements
         * Time complexity - O(n)
         */
        boolean yo = ara.containsAll(List.of(1, 100));
        System.out.println(yo);
    }
}
