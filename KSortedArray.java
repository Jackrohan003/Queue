import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

       int k = 3; 
        int a[] = { 2, 6, 3, 12, 56, 8 }; 
   
       largest(a,k); 

  }
  public static void largest(int a[],int k)
  {
    PriorityQueue<Integer> p = new PriorityQueue<Integer>();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<a.length;i++)
    {
        p.add(a[i]);
        if(p.size()>k)
            list.add(p.poll());
    } 
      while(p.size()>0){
        list.add(p.poll());
      }
      for(int x:list)
        System.out.print(x+" ");
  }
}
