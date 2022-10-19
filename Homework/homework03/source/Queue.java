package source;

public class Queue {
    protected int maxSize;
    protected long[] queArray;
    protected int front;
    protected int rear;
    protected int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = 0;
        nItems = 0;
    }

    public void insert(long j){
        if (rear == maxSize -1)
            rear = -1;
        if (rear +1 == front)
            front = (front +1) < maxSize ? front + 1 : 0;
        queArray[++rear] = j;
        nItems = nItems < maxSize ? nItems +1 : maxSize;
    }

    public long remove(){
        if (nItems == 0){
            return 404;
        }
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }

    public void displayQueue(){
        int end = rear;
        int start = front;
        int counter = 0;

        if (nItems != 0){
            if (end < start)
                end = maxSize -1;
            for (int pointer = start; pointer <= end; pointer++) {
                    System.out.println("QueueIndx: " + pointer + ",  N." + counter + ":  " + queArray[pointer] + "\n");
                    counter ++;
            }
            if (rear < front){
                end = rear;
                start = 0;
                for (int pointer = start; pointer <= end; pointer++) {
                    System.out.println("QueueIndx: " + pointer + ",  N." + counter + ":  " + queArray[pointer] + "\n");
                    counter ++;
                }
            }

        }
    }
}
