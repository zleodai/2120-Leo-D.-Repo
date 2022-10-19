package source;

public class Deque extends Queue{
    public Deque(int s){
        super(s);
    }

    public void insertRight(int x){
        if (rear == maxSize -1)
            rear = -1;
        if (rear +1 == front)
            front = (front +1) < maxSize ? front + 1 : 0;
        queArray[++rear] = x;
        if (nItems < 1)
            front = front < maxSize -1 ? front +1 : 0;
        nItems = nItems < maxSize ? nItems +1 : maxSize;
    }

    public void insertLeft(int x){
        if (front == 0)
            front = maxSize;
        if (front -1 == rear)
            rear = rear != 0 ? rear -1 : maxSize -1;
        queArray[--front] = x;
        if (nItems < 1)
            rear = rear < 0 ? rear -1 : maxSize -1;
        nItems = nItems < maxSize ? nItems +1 : maxSize;
    }

    public long removeLeft(){
        if (nItems == 0){
            return 404;
        }
        long temp = queArray[front];
        front = front != maxSize -1 ? front +1: 0;
        nItems--;
        return temp;
    }

    public long removeRight(){
        if (nItems == 0){
            return 404;
        }
        long temp = queArray[rear];
        rear = rear != 0 ? rear -1: maxSize -1;
        nItems--;
        return temp;
    }
}