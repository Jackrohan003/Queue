class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      Stack<Integer> stack = new Stack<>();
      Queue<Integer> tq = new LinkedList<>();
      
      while(k-- != 0)
      {
            stack.push(q.poll());
      }
      while(stack.isEmpty()==false)
      {
          tq.add(stack.pop());
      }
      while(q.isEmpty()==false)
        tq.add(q.poll());
        
      return tq;
    }
}
