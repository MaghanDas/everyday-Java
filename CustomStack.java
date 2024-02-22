
public class CustomStack{

    protected int[] data;
    private static final int DEFAULT_SIZE = 10 ;    
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size]; 
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

        public int pop() throws Exception{
             if (isEmplty()) {
                throw new Exception("cannot pop from empty stack..");
             }
            //  int removed = data[ptr];
            //  ptr--;
            //  return removed;
            return data[ptr--];
        }

        public int peek() throws Exception {
            if (isEmplty()) {
                throw new Exception("cannot pop from empty stack..");
             }
            return data[ptr];
        }
    public boolean isFull() { 
        return ptr == data.length-1;
    }

    public boolean isEmplty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(5);
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
