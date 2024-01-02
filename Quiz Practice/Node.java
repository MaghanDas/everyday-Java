public class Node {
  int value;
  Node next;

  public Node(int value){
    this.value = value;
  }
  public Node(int value, Node next){
    this.next = next;
  }
  public Node insertFirst(int value, Node head){
      if(head == null) {
        head = new Node(value,head);
        return head;
      }
  }
}
