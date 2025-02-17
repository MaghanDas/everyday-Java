
public class ArrayList {

  public static void main(String[] args) {

    ArraList<Integer> list = new ArrayList<>(10);
    ArraList<String> list2 = new ArrayList<>(10);

    // we use wrapper classes Like Integer, Boolean, Double, Float, Long, Short, Byte,

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(11);

    // we can add more than 10 elements in our arraylist than our initizlied size

    // it will double the size and copy all provious elements to new arraylist

    // list.set(0,99);
    list.remove(2); // index 2 value removed
    list.remove(Integer.valueOf(3)); // value 3 removed

    // for(int i = 0; i< 5; i++){
    // System.out.println(list.get(i));
    // // passing index and getting that value
    // }

    
      
  }
}