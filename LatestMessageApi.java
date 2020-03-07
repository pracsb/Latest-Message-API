import java.util.PriorityQueue;

class Main {
  public static void main(String[] args) {
    Handshake h = new Handshake();
    h.ack(1);
    h.ack(4);
    h.ack(2);
    System.out.println(h.latest());
    h.ack(7);
    h.ack(3);
    h.ack(6);
    h.ack(100);
    h.ack(8);
    h.ack(5);
    System.out.println(h.latest());
  }
}

class Handshake
{
  int msg_no;
  PriorityQueue<Integer> min_heap = new PriorityQueue<>((a,b)-> a-b);
  int largest = Integer.MIN_VALUE;
  public void ack(int number)
  {
    msg_no = number;
    System.out.println("Message "+msg_no+" recieved!!");
    if(largest==Integer.MIN_VALUE)
      largest = msg_no;
    else if(msg_no-largest==1)
    {
      largest = msg_no;
    }
    else{
      min_heap.add(msg_no);
    }
    while(!min_heap.isEmpty() && min_heap.peek()-largest==1)
    {
      largest = min_heap.poll();
    }
  }

  public int latest()
  { 
    return largest;
  }
}
