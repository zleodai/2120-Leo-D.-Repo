import source.*;

class Tester{

public static void main(String[] args){
    System.out.println("\n\nQueue Tester:\n\n\n\n");


    var theQueue = new Queue(5); 
    theQueue.insert(10);
    theQueue.insert(20);
    theQueue.insert(30);
    theQueue.insert(40);
    theQueue.remove(); 
    theQueue.remove();
    theQueue.remove();
    theQueue.insert(50); 
    theQueue.insert(60); 
    theQueue.insert(70);
    theQueue.insert(850);
    theQueue.insert(30);
    theQueue.insert(20); 

    theQueue.displayQueue();

    while( !theQueue.isEmpty() ){
        long n = theQueue.remove(); 
        System.out.print(n);
        System.out.print(" ");
    }

    System.out.println("\n\nDeque Tester:\n\n\n\n");


    var theDeque = new Deque(5);
    theDeque.insertLeft(2);
    theDeque.insertLeft(2);
    theDeque.insertRight(1);
    theDeque.insertRight(1);
    theDeque.insertRight(1);
    theDeque.removeLeft();
    theDeque.removeRight();

    theDeque.displayQueue();

    while( !theDeque.isEmpty() ){
        long n = theDeque.remove(); 
        System.out.print(n);
        System.out.print(" ");
    }
    

    System.out.println("\n\nCircular List Tester:\n\n\n\n");

    var theCircle = new CircularList(1);
    theCircle.insert(2);
    theCircle.insert(3);
    theCircle.insert(4);
    theCircle.insert(5);
    theCircle.delete();
    theCircle.step();
    theCircle.display();
    System.out.println("Does Circle have 4?  " + theCircle.has(4));
    System.out.println("Does Circle have 6?  " + theCircle.has(6));


    System.out.println("\n\nStack Tester:\n\n\n\n");
    var theStack = new StackList(1);
    theStack.push(2);
    theStack.push(3);
    theStack.push(4);
    theStack.push(5);
    theStack.push(6);

    System.out.println("Stack Item: " + theStack.pop());
    System.out.println("Stack Item: " + theStack.pop());
    System.out.println("Stack Item: " + theStack.pop());
    System.out.println("Stack Item: " + theStack.pop());
    System.out.println("Stack Item: " + theStack.pop());
    System.out.println("Stack Item: " + theStack.pop());
    } 
}