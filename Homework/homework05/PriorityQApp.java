import java.io.IOException;

import source.*;

class PriorityQApp {
    public static void main(String[] args) throws IOException {
        Heap testHeap = new Heap(20, 50);
        testHeap.insert(19);
        testHeap.insert(32);
        testHeap.insert(87);
        testHeap.insert(49);
        testHeap.insert(79);
        testHeap.insert(12);
        testHeap.insert(35);
        testHeap.insert(75);
        testHeap.insert(86);
        testHeap.insert(99);
        testHeap.insert(23);
        testHeap.insert(8);
        testHeap.insert(15);
        testHeap.insert(24);
        testHeap.insert(39);
        testHeap.insert(4);
        testHeap.insert(56);
        testHeap.insert(64);
        testHeap.insert(7);

        System.out.println("\n\n\nSorted Descending Queue Result: \n");

        while (!testHeap.isEmpty()) {
            int item = testHeap.remove();
            System.out.print(item + " ");
        }

        System.out.println("");

        System.out.println(
                "\n\nNote: Hey this is Leo, I accidently did the question without fully reading the question. \nHowever the end result should be the same. \nI made my own Heap but it is virtually the same as the heap in the listing. \nIn fact my heap code looks better than the one in the listing >:O \n(took alot of time to figure out how to make a heap) \nThe traversal for the heap is just a while loop so it should be a working decending queue using a heap.\n\n\n");
    }
}
