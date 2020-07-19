//By default priorityQueue arrange the items in ascending order.

import java.util.*;
class PriorityDescendingOrder {
  public static void main(String[] args) {
    //Descending order 
    PriorityQueue<Integer> abc = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });


    abc.add(3);abc.add(3);abc.add(1);abc.add(7);abc.add(2);
    System.out.println(abc);
    System.out.println(abc.poll());
    System.out.println(abc);

  }
}
