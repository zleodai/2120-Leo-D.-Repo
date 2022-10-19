package source;

public class CircularList {
    protected Node current;
    protected int size = 1;

    public CircularList(long x){
        current = new Node(x);
        current.next = current;
    }

    public void insert(long x){
        size++;
        var newNode = new Node(x);

        newNode.next = current.next;
        current.next = newNode;
        current = newNode;
    }

    public void delete(){
        size--;
        var currentNode = current;

        while (current.next != currentNode){
            current = current.next;
        }

        current.next = currentNode.next;
        current = current.next;
    }

    public void step(){
        current = current.next;
    }

    public boolean has(long g){
        var currentNode = current;

        for (int x = 1; x <= size; x++){
            if (current.value == g)
                return true;
            current = current.next;
        }

        current = currentNode;
        return false;
    }

    public void display(){
        var currentNode = current;

        for (int x = 1; x <= size; x++){
            System.out.println(current.value + "\n");
            current = current.next;
        }

        current = currentNode;
    }

    
    public class Node{
        long value;
        Node next;

        public Node(long x){
            value = x;     
        }
    }
}
