import source.*;

class AddNumbers {

    public static IntLinkedList add(IntLinkedList x, IntLinkedList y){
        IntLinkedList l1 = x;
        IntLinkedList l2 = y;
        var l1it = l1.getIteratorAt(0);
        var l2it = l2.getIteratorAt(0);
        IntLinkedList o = new IntLinkedList();

        int carryover = 0;
        while (l1it.hasNext() || l2it.hasNext()){
            var out = 0;
            var a = l1it.hasNext() ? l1it.getCurrentInt(): 0;
            var b = l2it.hasNext() ? l2it.getCurrentInt(): 0;
            if ((a + b + carryover >= 10)){
                carryover = carryover >= 1? 1: 1;
                out = a + b + carryover - 10;
            }else{
                out = a + b + carryover;
            }
            
            l1it.next();
            l2it.next();
            o.prepend(out);


        }
        return o;
        
    }

    public static void main(String[] args){

        IntLinkedList input1 = new IntLinkedList();
        input1.prepend(1);
        input1.prepend(2);
        input1.prepend(3);
        input1.prepend(4);
        input1.prepend(5);

        IntLinkedList input2 = new IntLinkedList();
        input1.prepend(1);
        input1.prepend(2);
        input1.prepend(3);


        IntLinkedList output = AddNumbers.add(input1, input2);
        IntLinkedList.Iterator outputIterator = output.getIteratorAt( 0 );
        while( outputIterator.hasNext() ) {
            System.out.println( "Current Node is: " + outputIterator.getCurrentInt() );
            outputIterator.next();
         }

    }

}
