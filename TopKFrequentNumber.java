import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int a[] = {1,1,1,2,2,2,2,2,2,2,3,33,3,3,3,3,4,4,4};
    int k = 2;
    
    int b [] = topKFrequent(a,k);
    
      for(int i=0;i<b.length;i++)
        System.out.println(b[i]);

  }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        
        map.forEach((num , freq) -> pq.add(num));
        
        int res[] = new int[k], i = 0;
        while(k-- > 0) res[i++] = pq.poll();
        return res;
    }
}
