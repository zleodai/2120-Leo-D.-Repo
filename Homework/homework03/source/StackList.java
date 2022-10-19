package source;

public class StackList {
    protected int size;
    protected Node top;

    public StackList(long x){
        top = new Node(x);
    }

    public void push(long x){
        var newNode = new Node(x);
        top.up = newNode;
        newNode.down = top;

        top = newNode;
    }

    public long pop(){
        long temp = top.value;
        top = top.down;
        return temp;
    }

    public long peek(){
        return top.value;
    }


    public class Node{
        long value;
        Node up;
        Node down;

        public Node(long x){
            value = x;     
        }
    }
}
