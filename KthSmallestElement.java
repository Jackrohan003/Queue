// Kth Smallest Element (Create Max Heap for finding Smallest Element & Min-Heap for Largest Element)
import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int a[] = {3,54,33,5,66,2 };
    int k = 3;

       smallestElement(a,k); 

  }
  public static void smallestElement(int a[],int k)
  {
    PriorityQueue<Integer> p = new PriorityQueue<Integer>(Comparator.reverseOrder());

    for(int i=0;i<a.length;i++)
    {
        p.add(a[i]);
        if(p.size()>k)
            p.poll();
    } 
      System.out.println(p.peek());
  }
}
