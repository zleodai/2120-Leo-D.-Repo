package source;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
    }

    public void oddEvenSort() {
        int j;
        boolean swapped = true;
        boolean run = true;

        while (run) {
            for (j = 0; j < nElems; j = j + 1) {
                var x = (nElems < j + 2 ? a[j] + 1 : a[j + 1]);
                if (a[j] > x) {
                    swap(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                run = false;

            swapped = false;
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}