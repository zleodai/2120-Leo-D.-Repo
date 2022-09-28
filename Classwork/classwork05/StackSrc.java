package stack;
class IntStack {

   private Node top;
   private int size;

   public IntStack() {
      top = null;
      size = 0;
   }

   public int getSize(){
      return size;
   }

   public void intialize(int x){
      top = new Node(x);
      size++;
   }

   public void push(int x){
      Node newTop = new Node(x);
      newTop.bottom = top;
      top.top = newTop;
      top = newTop;
      size++;
   }

   public int peek(){
      return top.data;
   }

   public int pop(){
      int output = top.data;
      top.top = null;
      top = top.bottom;
      return output;
   }

   private class Node {
      int data;
      Node top;
      Node bottom;

      Node ( int d ){
         data = d;
         top = null;
         bottom = null;
      }
   }
}

class Runner{

   public static void main(String[] args) {
       IntStack MyStack = new IntStack();

       MyStack.intialize(1);
       MyStack.push(5);
       MyStack.push(4);
       MyStack.push(2);
       MyStack.push(1);
       MyStack.push(9);
       MyStack.push(6);
       System.out.println("My Stack \n\n Size: " + MyStack.getSize() + ", Top: " + MyStack.peek());
       System.out.println(MyStack.pop());
       System.out.println(MyStack.pop());
       System.out.println(MyStack.pop());
       System.out.println(MyStack.pop());
       System.out.println(MyStack.pop());
       System.out.println(MyStack.pop());
       System.out.println(MyStack.pop());
    }
}