

public class LinkedQueue implements QueueInJava {

  private static class Node{
    Object data;
    Node next = this;
    Node prev = this;

    public Node (Object data){
      this.data = data;
    }

    public Node(Object data,Node next, Node prev){
      this.data = data;
      this.next = next;
      this.prev = prev;
    }
  }
  private Node head = new Node(null);
  private int size;
  public Object first(){
    if (size==0) {
      throw new IllegalStateException("queue is empty");
    }
    return head.next.data;
  }

  public void add(Object o) {
    head.prev.next = new Node(o,head.prev,head);
    head.prev = head.prev.next;
    size++;
  }
  public Object remove(){
    if (size == 0) {
      throw new IllegalStateException("queue is empty");
    }
    Object temp = head.next.data;
    head.next = head.next.next;
    head.next.prev = head;
    size--;
    return temp;
  }

  @Override
  public int getsize() {
    return size;
  }

  public static void main(String[] args) {

  }
}
