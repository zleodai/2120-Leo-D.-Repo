
import java.beans.beancontext.BeanContext;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;
        for(j = 0; j < nElems; j++)
            if(a[j] == searchKey)
                break;
        if(j == nElems)
            return false;
        else
            return true;
    }
    
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for(j = 0; j < nElems; j++)
            if(value == a[j])
                break;
        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }
    
    public void display() {
        for(int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void getMax(){
        long maxValue = 0;
        for(int j = 0; j < nElems; j++) {
            if(a[j] > maxValue)
                maxValue = a[j];
        }
        System.out.println("Max Value is " + maxValue);
    }

    public void noDups(){
        long[] b = new long[a.length];
        int bElems = 0;
        for(int j = 0; j < nElems; j++){
            for(int x = 0; x <= bElems; x++){
                if(a[j] == b[x]) {
                    a[j] = 0000;
                    break;
                }
            }
            if(a[j] != 0000) {
                b[bElems] = a[j];
                bElems++;
            }
        }
        System.out.println("Dupes Cleared");
        a = b;
        nElems = bElems;
    }
}