/*
1)PriorityQueue doesn’t permit null.
2)We can’t create PriorityQueue of Objects that are non-comparable
3)PriorityQueue are unbound queues.
4)The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements — ties are broken arbitrarily.
5)The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
6)It inherits methods from AbstractQueue, AbstractCollection, Collection and Object class.

*/
import java.util.*;

public class PriotityQueueExample
{
  public static void main(String args[])
    {



        PriorityQueue<Integer> numbers = new PriorityQueue<>();// By default Ascending order

    //PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder()); For Descending Order

        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);

        System.out.println("PriorityQueue: " + numbers);

        // Using the peek 
        System.out.println("Accessed Element: " + numbers.poll());
        System.out.println("Accessed Element: " + numbers.poll());
        System.out.println("Accessed Element: " + numbers.poll());

        //Using remove
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        //contains(element)	Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.

        result = numbers.contains(8);
        System.out.println("Is the element 8 in Queue " + result);

      //size()	Returns the length of the priority queue.
        System.out.println("Size of queue "+ numbers.size());
      //toArray()	Converts a priority queue to an array and returns it

  }
}
